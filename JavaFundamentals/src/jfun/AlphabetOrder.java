package jfun;
import java.util.Scanner;
public class AlphabetOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		char ch1 = sc.next().charAt(0);
        System.out.println("Enter b value: ");
        char ch2 = sc.next().charAt(0);
        if (ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        } else {
            System.out.println(ch2 + "," + ch1);
        }

        sc.close();
	}

}
