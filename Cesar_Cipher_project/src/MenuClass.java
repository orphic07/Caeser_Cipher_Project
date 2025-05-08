public class MenuClass {

    public void showOptions(String name){
        System.out.println("Welcome, " + name + "!");
        System.out.println("===================================");
        System.out.println("|  🏛️ Caesar Cipher Terminal 🏛️   |");
        System.out.println("===================================");
        System.out.println("| 1.🔒 Encrypt a File             |");
        System.out.println("| 2.🔓 Decrypt a File             |");
        System.out.println("| 0.❌ Exit                       |");
        System.out.println("===================================");
    }

    public String executeOption(int option){
        switch (option) {
            case 1:
                System.out.println("Please introduce the path/directory of your file for encrypting:");
                return "✅Encryption completed.";
            case 2:
                System.out.println("Please introduce the path/directory of your file for decrypting:");
                return "✅Encryption completed.";
            case 0:
                return "Bye Bye!👋";
            default:
                return "⚠️ERROR: Invalid option. Please try again.";
        }
    }
}
