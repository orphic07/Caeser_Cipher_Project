import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void showOptions(String name){
        System.out.println("Welcome, " + name + "!");
        System.out.println("===================================");
        System.out.println("|  🏛️ Caesar Cypher Terminal 🏛️   |");
        System.out.println("===================================");
        System.out.println("| 1.🔒 Encrypt a File             |");
        System.out.println("| 2.🔓 Decrypt a File             |");
        System.out.println("| 0.❌ Exit                       |");
        System.out.println("===================================");
    }

    public void executeOption(int option, Scanner scan) throws IOException {
        switch (option) {
            case 1:
                //Validate file
                String pathEncrypt = "";
                boolean isPathValid = false;
                while(!isPathValid){
                    System.out.println("Please introduce the path of your file for encrypting:");
                    pathEncrypt = scan.nextLine();
                    isPathValid = Validator.validateFile(pathEncrypt);
                }
                System.out.println("✅ Valid path received: " + pathEncrypt);
                //Validate key
                String keyEncrypt = "";
                boolean isKeyValid = false;
                while(!isKeyValid){
                    System.out.println("Please introduce the key for the encryption (0 + " + Alphabet.ENGLISH_ALPHABET.length + "):");
                    keyEncrypt = scan.nextLine();
                    int numKey = Integer.parseInt(keyEncrypt);
                    isKeyValid = Validator.validateKey(numKey, Alphabet.ENGLISH_ALPHABET);
                }
                //Encrypt
                StringBuilder fileContent = FileManager.readFile(pathEncrypt);
                StringBuilder encrypted = Cypher.encrypt(fileContent, Integer.parseInt(keyEncrypt), Alphabet.ENGLISH_ALPHABET);
                System.out.println("✅Encryption completed. ");
                break;
            case 2:
                System.out.println("Please introduce the path of your file for decrypting:");
                String pathDecrypt = scan.nextLine();
                System.out.println("Do you posses the decryption key?");
                System.out.println("1. Yes, I have the key.");
                System.out.println("2. No, I don't have the key. Try brute-force.");
                String hasKey = scan.nextLine();
                int numChoice = Integer.parseInt(hasKey);
                switch (numChoice){
                    case 1:
                        System.out.println("Please enter the decryption key:");
                        //key process
                    case 2:
                        System.out.println("Initiating brute-force decryption...");
                        System.out.println("Please wait while we try all possible combinations.");
                        System.out.println("This may take a moment depending on the file size.");
                        //brute force process
                    default:
                        System.out.println("⚠️ERROR: Invalid option. Please select 1 or 2.");
                }

                System.out.println("✅Encryption completed.");
                break;
            case 0:
                System.out.println("Exiting program... \nBye Bye!👋");
                break;
            default:
                System.out.println("⚠️ERROR: Invalid option. Please try again.");
                break;
        }
    }
}
