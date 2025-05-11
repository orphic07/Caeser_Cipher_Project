import java.io.*;

public class FileManager {

    public static StringBuilder readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder fullText = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null){
            fullText.append(line).append("\n");
        }

        reader .close();
        return fullText;
    }

    public static StringBuilder writeFile(String path) throws IOException {
        return new StringBuilder();
    }
}
