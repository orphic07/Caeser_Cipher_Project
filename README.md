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

