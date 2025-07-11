package oops;
import java.util.Scanner;
public class ShortLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1 Name");
		String str1 = sc.nextLine();
		System.out.println("Enter String2 Name");
		String str2 = sc.nextLine();
		sc.close();
		String strshort , strlong;
		if(str1.length() < str2.length()) {
			strshort = str2;
			strlong = str1;
		}
		String result = str2 + str1 + str2;
         System.out.println("Result " + result);
	}

}
