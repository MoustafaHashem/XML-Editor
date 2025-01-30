# XMLEditor 🚀 | Edit, Parse, and Visualize XML with Ease!

## Table of Contents 📑
1. [Description 📝](#description-)
2. [Features 🛠️](#features-)
   - [XML Parsing and Validation](#xml-parsing-and-validation)
   - [XML Formatting](#xml-formatting)
   - [XML to JSON Conversion](#xml-to-json-conversion)
   - [File Compression and Decompression](#file-compression-and-decompression)
   - [Graphical Visualization](#graphical-visualization)
   - [Network Analysis](#network-analysis)
   - [Post Search](#post-search)
   - [User-Friendly Interface](#user-friendly-interface)
3. [Installation 📥](#installation-)
4. [Usage 🖥️](#usage-)
   - [GUI Mode](#gui-mode)
   - [CLI Mode](#cli-mode)
     - [Checking XML Consistency](#checking-xml-consistency)
     - [Formatting (Prettifying) the XML](#formatting-prettifying-the-xml)
     - [Converting XML to JSON](#converting-xml-to-json)
     - [Minifying the XML File](#minifying-the-xml-file)
     - [Compressing XML File](#compressing-xml-file)
     - [Decompressing XML File](#decompressing-xml-file)
     - [Representing the XML in a Graph](#representing-the-xml-in-a-graph)
     - [Network Analysis](#network-analysis-cli)
     - [Post Search](#post-search-cli)
5. [Documentation 📚](#documentation-)
6. [Contributing 🤝](#contributing-)
7. [License 📜](#license-)

---

## Description 📝

**XMLEditor** is a comprehensive JavaFX-based desktop application designed for parsing, editing, and visualizing XML files. It provides a wide range of features for manipulating XML data, including validation, formatting, compression, and conversion to JSON. Additionally, the application offers tools for analyzing and visualizing social network data represented in XML format, such as identifying influential users, mutual followers, and suggesting connections. The application is designed to cater to both casual users through a **Graphical User Interface (GUI)** and advanced users via a **Command-Line Interface (CLI)**, ensuring accessibility and usability for a wide range of users.

For detailed documentation on how the project works and how to contribute, please refer to the [Documentation](https://moustafahashem.github.io/XMLEditorProject/).

---

## Features 🛠️

### XML Parsing and Validation
- **Validation:** The application ensures that XML files are well-formed by checking for proper tag nesting, closing tags, and structural integrity.
- **Error Handling:** Errors are highlighted with line numbers, and the application provides options for auto-correction, allowing users to fix issues and save the corrected file.

### XML Formatting
- **Prettifying:** The application improves the readability of XML files by indenting nested elements and removing unnecessary whitespace while maintaining the structure.
- **Minification:** Users can reduce the file size by removing all unnecessary whitespace and newlines, making the XML file more compact.

### XML to JSON Conversion
- **Conversion:** The application converts XML data into JSON format, making it easier to integrate with JavaScript-based tools and applications.
- **Compatibility:** The JSON output is structured to ensure compatibility with modern web applications and APIs.

### File Compression and Decompression
- **Compression:** The application uses **Byte Pair Encoding (BPE)** to compress XML/JSON files, reducing their size for efficient storage and transfer.
- **Decompression:** Compressed files can be decompressed back to their original format, ensuring data integrity and usability.

### Graphical Visualization
- **Graph Representation:** The application visualizes user relationships as a directed graph, where nodes represent users and edges represent follower relationships.
- **Interactive Graph:** Users can interact with the graph, zoom in/out, and explore connections between users.

### Network Analysis
- **Influential Users:** The application identifies the most influential user in the network (the user with the maximum number of followers).
- **Active Users:** It also identifies the most active user (the user with the maximum number of connections).
- **Mutual Followers:** Users can find mutual followers between any two users in the network.
- **Follow Suggestions:** The application suggests new connections by analyzing the network and recommending users to follow (e.g., followers of followers).

### Post Search
- **Keyword Search:** Users can search for posts containing specific keywords or topics within the XML data.
- **Topic Search:** The application allows users to search for posts related to specific topics, making it easier to analyze user-generated content.

### User-Friendly Interface
- **Graphical User Interface (GUI):** The GUI is designed for ease of use, with intuitive buttons and menus for performing operations like parsing, formatting, compressing, and visualizing XML files.
- **Command-Line Interface (CLI):** Advanced users can use the CLI to execute operations through simple commands, making it suitable for automation and scripting.

---

## Installation 📥

1. **Clone the repository:**
   ```bash
   git clone https://github.com/MoustafaHashem/XMLEditorProject.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd XMLEditorProject
   ```

3. **Compile and run the application:**
   ```bash
   ./run.sh
   ```

---

## Usage 🖥️

### GUI Mode
- **Opening Files:** Users can open XML files using the "Open" button in the GUI. The application supports various file formats, including `.xml`, `.json`, and `.comp`.
- **Performing Operations:** Users can perform operations like validation, formatting, compression, and conversion by clicking the corresponding buttons in the GUI.
- **Visualizing Data:** The application provides a graph visualization tool to explore user relationships and network analysis results.

### CLI Mode
The CLI mode allows advanced users to execute operations through commands. Below are the available commands and their expected outputs:

#### Checking XML Consistency
- **Command:**
  ```bash
  xml_editor verify -i input_file.xml -f -o output_file.xml
  ```
- **Expected Output:**
  - If the XML is consistent, the output will be "Valid XML" in the console.
  - If the XML is invalid, the application will display the number of errors and the lines where they occur.
  - If the `-f` option is used, the application will fix the errors and save the corrected version in `output_file.xml`.

#### Formatting (Prettifying) the XML
- **Command:**
  ```bash
  xml_editor format -i input_file.xml -o output_file.xml
  ```
- **Expected Output:**
  - The input XML file will be formatted (prettified) and saved in `output_file.xml`.

#### Converting XML to JSON
- **Command:**
  ```bash
  xml_editor json -i input_file.xml -o output_file.json
  ```
- **Expected Output:**
  - The input XML file will be converted to JSON format and saved in `output_file.json`.

#### Minifying the XML File
- **Command:**
  ```bash
  xml_editor mini -i input_file.xml -o output_file.xml
  ```
- **Expected Output:**
  - The input XML file will be minified (unnecessary whitespace removed) and saved in `output_file.xml`.

#### Compressing XML File
- **Command:**
  ```bash
  xml_editor compress -i input_file.xml -o output_file.comp
  ```
- **Expected Output:**
  - The input XML file will be compressed using Byte Pair Encoding and saved in `output_file.comp`.

#### Decompressing XML File
- **Command:**
  ```bash
  xml_editor decompress -i input_file.comp -o output_file.xml
  ```
- **Expected Output:**
  - The compressed file (`input_file.comp`) will be decompressed and saved as `output_file.xml`.

#### Representing the XML in a Graph
- **Command:**
  ```bash
  xml_editor draw -i input_file.xml -o output_file.jpg
  ```
- **Expected Output:**
  - The input XML data will be represented as a graph and saved as `output_file.jpg`.

#### Network Analysis
- **Most Active User:**
  - **Command:**
    ```bash
    xml_editor most_active -i input_file.xml
    ```
  - **Expected Output:**
    - The most active user's name and ID will be displayed.

- **Most Influencer User:**
  - **Command:**
    ```bash
    xml_editor most_influencer -i input_file.xml
    ```
  - **Expected Output:**
    - The most influential user's name and ID will be displayed.

- **Mutual Followers:**
  - **Command:**
    ```bash
    xml_editor mutual -i input_file.xml -ids 1,2,3
    ```
  - **Expected Output:**
    - A list of mutual followers between users with IDs 1, 2, and 3 will be displayed.

- **Follow Suggestions:**
  - **Command:**
    ```bash
    xml_editor suggest -i input_file.xml -id 1
    ```
  - **Expected Output:**
    - A list of suggested users for the user with ID 1 will be displayed.

#### Post Search
- **Keyword Search:**
  - **Command:**
    ```bash
    xml_editor search -w word -i input_file.xml
    ```
  - **Expected Output:**
    - A list of posts containing the specified keyword will be displayed.

- **Topic Search:**
  - **Command:**
    ```bash
    xml_editor search -t topic -i input_file.xml
    ```
  - **Expected Output:**
    - A list of posts related to the specified topic will be displayed.

---

## Documentation 📚

For more detailed information on how to use the application, its features, and how to contribute, please visit the [Documentation](https://moustafahashem.github.io/XMLEditorProject/).

---

## Contributing 🤝

We welcome contributions to the project! If you'd like to contribute, please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with a detailed description of your changes.

---

## License 📜

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---
