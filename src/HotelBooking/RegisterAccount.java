package HotelBooking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegisterAccount {
    public void register(Scanner scanner) {
        // Create a folder in the system
        String folderPath = "C:\\Users\\Sushmitha\\IdeaProjects\\JavaProjects\\src\\HotelBooking\\jsonfolder";
        createFolder(folderPath);

        // Create a JSON file
        int randomNumber = (int) (Math.random() * 100000);
        String fileName = "ACC_" + randomNumber + ".json";
        String filePath = folderPath + "/" + fileName;

        // Ask the user to enter details
        System.out.print("Enter first name: ");
        String firstName = scanner.next();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Enter email address: ");
        String email = scanner.next();

        System.out.print("Enter address: ");
        String address = scanner.next();

        // Write details to the JSON file
        writeToJsonFile(filePath, firstName, phoneNumber, email, address);

        System.out.println("Account registered successfully!");
    }

    private static void createFolder(String folderPath) {
        // Create folder in the system
        File folder = new File(folderPath);
        if (!folder.exists()) {
            if (folder.mkdirs()) {
                System.out.println("Folder created: " + folderPath);
            } else {
                System.out.println("Failed to create folder.");
            }
        } else {
            System.out.println("Folder already exists: " + folderPath);
        }
    }

    private static void writeToJsonFile(String filePath, String firstName, String phoneNumber, String email, String address) {
        // Write user details to the JSON file
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write("{\n");
            fileWriter.write("  \"firstName\": \"" + firstName + "\",\n");
            fileWriter.write("  \"phoneNumber\": \"" + phoneNumber + "\",\n");
            fileWriter.write("  \"email\": \"" + email + "\",\n");
            fileWriter.write("  \"address\": \"" + address + "\"\n");
            fileWriter.write("}\n");
            System.out.println("Details written to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
