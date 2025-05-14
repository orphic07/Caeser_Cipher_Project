import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void showOptions(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Caesar Cypher! What is your name?");
        String name = scan.nextLine();
        System.out.println("Welcome, " + name + "!");
        System.out.println("===================================");
        System.out.println("|  🏛️ Caesar Cypher Terminal 🏛️   |");
        System.out.println("===================================");
        System.out.println("| 1.🔒 Encrypt a File             |");
        System.out.println("| 2.🔓 Decrypt a File             |");
        System.out.println("| 0.❌ Exit                       |");
        System.out.println("===================================");

        System.out.println("ℹ️ This Cypher only supports the following characters: A-Z | a-z | 0-9 | . , ! ? \nPlease select an option: ");
    }

    public void executeOption() {

        Scanner scan = new Scanner(System.in);
        boolean isValid = false;
        int option = scan.nextInt();
        scan.nextLine();

        while(!isValid){
            try {

                switch (option) {
                    case 1:

                        //Step 1: Introduce and Validate file

                        String pathEncrypt = "";
                        boolean isPathValidE = false;

                        while(!isPathValidE){
                            System.out.println("Please introduce the path of your file for encrypting:");
                            pathEncrypt = scan.nextLine();
                            isPathValidE = Validator.validateFile(pathEncrypt);
                        }

                        System.out.println("✅ Valid path received: " + pathEncrypt);

                        //Step 2: Introduce and Validate key

                        int keyEncrypt = 0;
                        boolean isKeyValidE = false;

                        while (!isKeyValidE) {
                            System.out.println("Please introduce the key for encryption (0 + " + Alphabet.ENGLISH_ALPHABET.length + "):");

                            keyEncrypt = scan.nextInt();
                            isKeyValidE = Validator.validateKey(keyEncrypt);

                        }

                        //Step 3: Encrypt given file

                        StringBuilder fileContentE = FileManager.readFile(pathEncrypt);
                        String encryptedText = Cypher.encrypt(fileContentE, keyEncrypt, Alphabet.ENGLISH_ALPHABET);

                        //Step 4: Create new file with encrypted text

                        FileManager.createFileForEnc(encryptedText);

                        //Step 5: Finish program
                        isValid = true;
                        break;

                    case 2:

                        //Step 1: Introduce and Validate file

                        String pathDecrypt = "";
                        boolean isPathValidD = false;

                        while(!isPathValidD){
                            System.out.println("Please introduce the path of your file for decrypting:");
                            pathDecrypt = scan.nextLine();
                            isPathValidD = Validator.validateFile(pathDecrypt);
                        }

                        System.out.println("✅ Valid path received: " + pathDecrypt);

                        //Step 2: Check if user has key

                        System.out.println("Do you posses the decryption key?");
                        System.out.println("1. Yes, I have the key.");
                        System.out.println("2. No, I don't have the key. Try brute-force.");

                        String hasKey = scan.nextLine();
                        int choice = Integer.parseInt(hasKey);

                        switch (choice) {

                            case 1:

                                //Step 3.1: Introduce and validate key

                                int keyDecrypt = 0;
                                boolean isKeyValidD = false;

                                while (!isKeyValidD) {
                                    System.out.println("Please introduce the key for the decryption (0 + " + Alphabet.ENGLISH_ALPHABET.length + "):");

                                    keyDecrypt = scan.nextInt();
                                    isKeyValidD = Validator.validateKey(keyDecrypt);

                                }

                                //Step 3.1.2: Decrypt given file

                                StringBuilder fileContentD = FileManager.readFile(pathDecrypt);
                                String decryptedText = Cypher.decrypt(fileContentD, keyDecrypt, Alphabet.ENGLISH_ALPHABET);

                                //Step 4: Create new file with encrypted text

                                FileManager.createFileForDec(decryptedText);

                                break;

                            case 2:

                                //Step 3.2: Initialize brute-force to find key

                                System.out.println("Initiating brute-force decryption...");
                                System.out.println("Please wait while we try all possible combinations.");
                                System.out.println("This may take a moment depending on the file size.");

                                //brute force process

                            default:

                                System.out.println("⚠️ERROR: Invalid option. Please select 1 or 2.");
                        }

                        isValid = true;
                        break;

                    case 0:

                        System.out.println("Exiting program... \nBye Bye!👋");
                        isValid = true;
                        break;

                }

            } catch (InputMismatchException i) {

                System.out.println("⚠️ERROR: Invalid option. Please try again.");

            } catch (IOException e){

                throw new RuntimeException(e);

            }
        }
    }
}
