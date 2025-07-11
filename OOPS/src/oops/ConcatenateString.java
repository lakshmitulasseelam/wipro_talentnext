package oops;
import java.util.Scanner;
public class ConcatenateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter first string: ");
       String str1 = sc.nextLine();
       System.out.print("Enter second string: ");
       String str2 = sc.nextLine();
       sc.close();
       if (!str1.isEmpty() && !str2.isEmpty() && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
           str1 = str1.substring(0, str1.length() - 1);
	}
       String result = (str1 + str2).toLowerCase();
       System.out.println("Result: " + result);
   }
}
