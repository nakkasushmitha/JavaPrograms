package Practiceprog;

public class Commandlineargs {
    public static void main(String[] args) {
        // Check if command-line arguments are present
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            // Print all values separated by commas
            System.out.print("Arguments received: ");
            for (int i = 0; i < args.length - 1; i++) {
                System.out.print(args[i] + ",");
            }
            // Print the last argument without a comma
            System.out.println(args[args.length - 1]);
        }
    }
}
