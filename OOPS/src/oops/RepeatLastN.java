package oops;
import java.util.Scanner;
public class RepeatLastN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str =sc.nextLine();
		System.out.println("Enter a number n");
		int n = sc.nextInt();
		sc.close();
		if(n < 0  || n >str.length()){
			System.out.println("Invalid" +str.length());
			return;
		}
		String lastN = str.substring(str.length() -n);
		String result = "";
		for(int i = 0; i < n; i++) {
			result += lastN;
		
		}
		System.out.println("Result : " + result);

	}

}
