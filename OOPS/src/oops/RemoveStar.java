package oops;
import java.util.Scanner;
public class RemoveStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Name");
		String str = sc.nextLine();
		sc.close();
		String output = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Skip the '*' character and its left/right neighbors
            if (ch == '*') {
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }

            output = output + ch;
        }

        System.out.println("Result: " + output);
	}

}
