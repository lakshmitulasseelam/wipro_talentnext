package jfun;
import java.util.Scanner;

class Box {
    double width, height, depth;

    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter depth: ");
        double depth = sc.nextDouble();

        // Creating Box object using user input
        Box myBox = new Box(width, height, depth);

        // Printing volume
        System.out.println("Volume of the box is: " + myBox.getVolume());
    }
}
