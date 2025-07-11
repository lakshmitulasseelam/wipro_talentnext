package oops;

import java.util.Scanner;

public class Employee extends Person {
    double annualSalary;
    int yearStarted;
    String nationalInsuranceNumber;

    public Employee(String name, double salary, int year, String insurance) {
        super(name); 
        this.annualSalary = salary;
        this.yearStarted = year;
        this.nationalInsuranceNumber = insurance;
    }

    public void printDetails() {
        System.out.println("Name: " + name); 
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Year Started: " + yearStarted);
        System.out.println("National Insurance Number: " + nationalInsuranceNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter year started: ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter national insurance number: ");
        String insurance = sc.nextLine();

        Employee emp = new Employee(name, salary, year, insurance);
        emp.printDetails();
    }
}
