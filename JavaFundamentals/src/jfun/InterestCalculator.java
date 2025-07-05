package jfun;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter gender (Male/Female): ");
        String gender = scanner.nextLine();

 
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

     
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest rate: 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest rate: 9.2%");
            } else {
                System.out.println("Invalid age range.");
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest rate: 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest rate: 10.5%");
            } else {
                System.out.println("Invalid age range.");
            }
        } else {
            System.out.println("Invalid gender input.");
        }

        scanner.close();
    }
}
