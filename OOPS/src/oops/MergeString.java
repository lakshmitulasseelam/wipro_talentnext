package oops;
import java.util.Scanner;
public class MergeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Name");
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		StringBuilder result = new StringBuilder();
		int maxLen = Math.max(a.length(), b.length());
        for(int i = 0; i < maxLen; i++) {
        	if (i < a.length()) result.append(a.charAt(i));
            if (i < b.length()) result.append(b.charAt(i));
        }
        System.out.println("Result" + result);

	}

}
