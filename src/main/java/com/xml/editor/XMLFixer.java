package com.xml.editor;
import java.util.*;
/**
 * A utility class for fixing XML content by ensuring that all tags are properly opened and closed.
 * <p>
 * The {@code XMLFixer} class scans through the provided XML content, identifies mismatched
 * or missing tags, and ensures the XML structure is well-formed by adding any necessary
 * opening or closing tags.
 * </p>
 * <p>Example usage:</p>
 * <pre>
 *     List<String> fixedXml = new XMLFixer(xmlLines).fix();
 * </pre>
 */
public class XMLFixer
{
    private final List<String> lines;
    private final XMLTagsTracker openTags;
    private final List<String> fixedLines;

    /**
     * Constructs an instance of {@code XMLFixer}.
     *
     * @param lines the list of XML lines that need to be fixed.
     */
    public XMLFixer(List<String> lines)
    {
        this.lines = lines;
        this.openTags = new XMLTagsTracker();
        fixedLines = new ArrayList<>();
    }

    /**
     * Fixes the provided XML content by ensuring all tags are properly opened and closed.
     *
     * <p>This method iterates through the XML lines, checks for mismatched or missing tags,
     * and ensures that the XML structure is well-formed by adding the necessary opening or
     * closing tags where appropriate.</p>
     *
     * @return a list of fixed XML lines.
     */
    public List<String> fix()
    {
        processLines();
        addMissingClosingTag();
        return fixedLines;
    }

    private void processLines()
    {
        for (String line : lines)
        {
            String trimmedLine = line.trim();
            if (trimmedLine.isEmpty())
                continue; // Skip empty lines

            List<String> tokens = XMLTagUtils.splitTagsAndContent(trimmedLine);
            processTokens(tokens);
        }
    }

    private void processTokens(List <String> tokens)
    {
        for (String token : tokens)
        {
            if (XMLTagUtils.isOpenTag(token))
                handleOpenTag(token);

            else if (XMLTagUtils.isCloseTag(token))
                handleCloseTag(token);

            else
                handleBody(token);
        }
    }

    private void handleOpenTag(String tag)
    {
        openTags.pushTag(tag);
        fixedLines.add(tag);
    }
    private void handleCloseTag(String tag)
    {
        if (openTags.isTopTagMatches(tag))
        {
            fixedLines.add(tag);
            openTags.popTag();
        }
        else
        {
            if (openTags.isTagPresent(XMLTagUtils.createOpeningTag(tag)))
                fixedLines.add(XMLTagUtils.createClosingTag(openTags.popTag()));
            else
            {
                fixedLines.add(XMLTagUtils.createOpeningTag(tag));
                fixedLines.add(tag);
            }
        }
    }

    private void handleBody(String content)
    {
        fixedLines.add(content);
    }

    private void addMissingClosingTag()
    {
        while (!openTags.isEmpty())
        {
            String closeTag = XMLTagUtils.createClosingTag(openTags.popTag());
            fixedLines.add(closeTag); // Add each missing closing tag on a new line
            System.out.println("Missing closing tag added: " + closeTag);
        }
    }
}
