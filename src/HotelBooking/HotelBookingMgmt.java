package HotelBooking;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class HotelBookingMgmt {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        HotelBookingMgmt hotelbooking = new HotelBookingMgmt();

        System.out.println("1. Register Account");
        System.out.println("2. Book Reservation");
        System.out.println("3. Generate Bill");
        System.out.println("4. Feedback");

        System.out.println("Please provide me your preferred choice");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                RegisterAccount registerAccount = new RegisterAccount();
                registerAccount.register(scanner);
                break;
            case 2:
                BookReservation bookreservation = new BookReservation();
                bookreservation.reservation(scanner);

//                break;
//            case 3:
//                generateBill(scanner);
//                break;
//            case 4:
//                feedback(scanner);
//                break;
            default:
                System.out.println("Invalid option selected, select valid choice");
        }
    }
}
