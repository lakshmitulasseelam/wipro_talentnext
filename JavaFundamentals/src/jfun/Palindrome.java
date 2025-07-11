package jfun;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int num = sc.nextInt();
		int a = num;
		int res = 0;
		while(num!= 0) {
			int x = num % 10;
			res = res *10 + x;
			num = num / 10;
		}
		if (a == res) {
            System.out.println(a + " is a palindrome");
        } else {
            System.out.println(a + " is not a palindrome");
        }
	}

}
