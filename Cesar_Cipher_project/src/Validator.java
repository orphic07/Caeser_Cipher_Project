import java.io.File;

public class Validator {

    public static boolean validateFile(String pathEncrypt){
        File file = new File(pathEncrypt);
        if (file.exists() && file.isFile()){
            return true;
        } else {
            System.out.println("⚠️ERROR: File not found or path is invalid. Please try again");
            return false;
        }
    }

    public static boolean validateKey(int numKey, char[] alphabet){
        alphabet = Alphabet.ENGLISH_ALPHABET;
        if (numKey >= 0 && numKey <= alphabet.length) {
            return true;
        } else {
            System.out.println("⚠️ERROR: Invalid key. Please try again");
            return false;
        }
    }
}
