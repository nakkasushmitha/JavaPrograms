package HotelBooking;

import java.io.File;
import java.util.Scanner;

public class BookReservation {

 /*   private AccountVerifier accountVerifier;
    public void BookReservation(){
        this.accountVerifier = new AccountVerifier();
    }
    */

    private boolean verifyAccount(String acctnum) {
        // Construct the expected file name based on the account number
        String filename = "ACC_" + acctnum + ".json";

        // Check if the file exists
        File file = new File("C:\\Users\\Sushmitha\\IdeaProjects\\JavaProjects\\src\\HotelBooking\\jsonfolder/" + filename);
        return file.exists();
    }

    public void reservation(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Are you registered already? (yes/no)");
        String registered = scanner.nextLine().toLowerCase();

        if ("yes".equals(registered)) {
            System.out.println("Please enter your account number");
            String acctnum = scanner.nextLine();

            String filename = "ACC_" + acctnum + ".json";
            File file = new File("C:\\Users\\Sushmitha\\IdeaProjects\\JavaProjects\\src\\HotelBooking\\jsonfolder/" + filename);

            if (file.exists()) {
                System.out.println("Verification Successful");

                System.out.println("Select reservation type:");
                System.out.println("1. Book Hotel");
                System.out.println("1. Book Villa");
                System.out.println("1. Book Flat");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Booking Hotel.");
                        //will add logic later
                        break;
                    case 2:
                        System.out.println("Booking Villa.");
                        //will add logic later
                        break;
                    case 3:
                        System.out.println("Booking Flat.");
                        //will add logic later
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
            else {
                System.out.println("Verification failed! please verify your account number.");
            }
        }
        else {
           // scanner.nextLine();
            System.out.println("Please register first");
        }
    }
}
