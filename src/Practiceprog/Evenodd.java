package Practiceprog;

import java.util.Scanner;

public class Evenodd {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        Integer number = scanner.nextInt();

        if(number%2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}
