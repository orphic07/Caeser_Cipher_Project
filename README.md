# Caeser_Cipher_Project
Projecto 2025, modulo 1
## 🧠 Project Overview
Caesar Cipher Encryption Tool

A Java-based command-line tool to encrypt and decrypt .txt files using a Caesar Cipher. It allows users to enter file paths, validates input, and uses character manipulation to apply encryption or decryption.
## ⚙️ Program Flow
Main Flow:
The program displays a menu with three main options:
1. Encrypt a file
2. Decrypt a file
3. Exit

Based on the user’s selection, it:
- Requests the file path
- Validates the file’s existence and format
- Requests a numeric key for the cipher
- Reads the content of the file
- Encrypts or decrypts the content
- Outputs the result to a new .txt file

## 🔄 Diagram: Encryption Flow
Here’s a sketch flowchart of the Caesar Cipher encryption process:

### 📦 Code Architecture
MenuClass.java
- showOptions() method | Displays the program menu.
- executeOption(int option) method | Handles logic for encryption or decryption.
  - Calls the validator for path and key
  - If both inputs are valid:
    - Reads the file
    - Sends contents to the CipherClass

CipherClass.java
- int key – Defines the shift value for the Caesar Cipher.
- char[] alphabet – Custom alphabet used for encryption.
- encrypt(String line, int key) – Applies Caesar Cipher to the input string.
- decrypt(String line, int key) – Reverses Caesar Cipher logic.

# ------------------------------------------------------------------------------

# Caesar Cipher Project — Final Version
## 📌 Project Overview
This is a Java-based Caesar Cipher program that allows you to:

- 🔒 Encrypt files using a Caesar Cipher shift
- 🔓 Decrypt files with a known key
- 💣 Brute-force decrypt files without a key

### 📁 Folder Structure
/src

├── Main.java 

Entry point of the program.
- Instantiates the Menu class
- Starts the menu loop to let the user choose between encryption, decryption, or brute force
  
├── Menu.java

Handles user interaction through a console menu.
- showOptions() displays the available operations
- executeOption() handles input, file/key validation, and triggers the corresponding logic
- Also asks if the user has a key for decryption and routes to brute force if not

  
├── Validator.java
  
Validates file paths and encryption/decryption keys.
- validateFile(String path) checks if the file exists
- validateKey(int key) ensures the key is within valid range 

├── FileManager.java

Manages file input/output operations.
- readFile(String path) reads a file and returns its content as StringBuilder
- createFileForEnc(String text) writes the encrypted text to encrypted_file.txt
- createFileForDec(String text) writes the decrypted text to decrypted_file.txt
  
├── Cypher.java

Core encryption and decryption logic using the Caesar Cipher.
- encrypt(StringBuilder text, int key, char[] alphabet) shifts characters forward by key
- decrypt(StringBuilder text, int key, char[] alphabet) shifts characters backward by key
- Skips characters not in the defined alphabet (keeps them unchanged)
  
├── BruteForce.java

Attempts to decrypt a file without a known key by trying every possible Caesar shift.
- crack(StringBuilder fileContent, char[] alphabet) loops through all keys and appends the decrypted output for each
- Currently uses basic preview (All possible combinations in the file, no auto-validation)
  
└── Alphabet.java
Defines the Caesar Cipher alphabet.
- ENGLISH_ALPHABET contains uppercase, lowercase, digits, and punctuation:
A-Z a-z 0-9 . , ! ? [space]
  
README.md

subaruSpeech.txt

### ⚙️ How It Works
1. Run the program.
2.  Use the console menu to select an action:
- Encrypt
- Decrypt
  - With Key
  - With BF
- Exit

3. Input file paths and key as required.
4. The program creates an output file with the results.

### 🧠 Brute Force Method
- Decrypts the file with every possible key.
- Outputs all possible decryptions.
- You can review them to find the correct one.

✍️ Author
Juan Felipe Marin
Modulo 1 - CodeGym
Profesor: Lionel 
