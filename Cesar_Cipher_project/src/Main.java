import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu myMenu = new Menu();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Caesar Cypher! What is your name?");
        String name = scan.nextLine();
        boolean exit = false;
        while (!exit) {
            myMenu.showOptions(name);
            System.out.println("ℹ️ This Cypher only supports the following characters: A-Z | a-z | 0-9 | . , ! ? ");
            System.out.println("Please select an option: ");
            String myOption = scan.nextLine();
            int numOption = Integer.parseInt(myOption);
            myMenu.executeOption(numOption, scan);
            if (numOption == 0) {
                exit = true;
            }
        }
    }
}