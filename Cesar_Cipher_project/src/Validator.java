import java.io.File;
import java.util.Scanner;

public class Validator {

    public static boolean validateFile(String pathEncrypt, Scanner scan){
        File file = new File(pathEncrypt);
        if (file.exists() && file.isFile()){
            return true;
        } else {
            System.out.println("⚠️ERROR: File not found or path is invalid. Please try again");
            return false;
        }
    }

    public static boolean validateKey(int numKey, char[] alphabet){

        return true;
    }
}
