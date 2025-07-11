package oops;
import java.util.Scanner;
public class RepatFirsttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		sc.close();
		int n = str.length();
		String first2 = n < 2 ?  str : str.substring(0, 2);
		StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
        	result.append(first2);
        }
        System.out.println("Result: " + result.toString());
		

	}

}
