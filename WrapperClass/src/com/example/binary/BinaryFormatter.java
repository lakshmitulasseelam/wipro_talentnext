package com.example.binary;

import java.util.Scanner;

public class BinaryFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 255: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Invalid input! Number must be between 1 and 255.");
            return;
        }

        
        String binary = Integer.toBinaryString(number);

       
        String formattedBinary = String.format("%8s", binary).replace(' ', '0');

    
        System.out.println("Binary representation: " + formattedBinary);
    }
}