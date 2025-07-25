import java.util.Scanner;
public class WrapperClass4M {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (1 to 255): ");
        int number = sc.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Invalid input! Please enter a number between 1 and 255.");
        } else {
            String binary = Integer.toBinaryString(number);
            String paddedBinary = String.format("%8s", binary).replace(' ', '0');
            System.out.println("Binary representation (8-bit): " + paddedBinary);
        }
    }
}
