package jfun;


import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1 to 12): ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Please enter the month in numbers");
            return;
        }

        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            return;
        }

        for (int i = 1; i <= 12; i++) {
            if (i == month) {
                if (i == 1) System.out.println("January");
                if (i == 2) System.out.println("February");
                if (i == 3) System.out.println("March");
                if (i == 4) System.out.println("April");
                if (i == 5) System.out.println("May");
                if (i == 6) System.out.println("June");
                if (i == 7) System.out.println("July");
                if (i == 8) System.out.println("August");
                if (i == 9) System.out.println("September");
                if (i == 10) System.out.println("October");
                if (i == 11) System.out.println("November");
                if (i == 12) System.out.println("December");
            }
        }
    }
}
