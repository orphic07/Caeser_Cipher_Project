import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuClass myMenu = new MenuClass();
        myMenu.showOptions("Michael");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select an option: ");
        int myOption = scan.nextInt();
        String chosenOption = myMenu.executeOption(myOption);
        System.out.println(chosenOption);
    }
}