package jfun;

import java.util.Scanner;

public class CompanyLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter company name: ");
        String company = sc.nextLine();

        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        System.out.println(company + " Technologies " + city);

        sc.close();
    }
}
