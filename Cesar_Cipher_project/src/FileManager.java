import java.io.*;

public class FileManager {

    public static StringBuilder readFile(String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder text = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null){
            text.append(line).append("\n");
        }

        reader.close();
        return text;
    }

    public static void createFileForEnc(String encryptedText) throws IOException {

        String fileName = "encrypted_" + System.currentTimeMillis() + ".txt";
        FileWriter newFile;

        try {

            newFile = new FileWriter(fileName);

            BufferedWriter writer = new BufferedWriter(newFile);

            writer.write(encryptedText);
            writer.close();

            System.out.println("✅Encryption completed. File successfully created: " + fileName);

        } catch (IOException e){

            System.out.println("⚠️ERROR: Unable to create file");

        }
    }

    public static void createFileForDec(String decryptedText) throws IOException {

        String fileName = "decrypted_" + System.currentTimeMillis() + ".txt";
        FileWriter newFile;

        try {

            newFile = new FileWriter(fileName);

            BufferedWriter writer = new BufferedWriter(newFile);

            writer.write(decryptedText);
            writer.close();

            System.out.println("✅Decryption completed. File successfully created: " + fileName);

        } catch (IOException e){

            System.out.println("⚠️ERROR: Unable to create file");

        }
    }
}
