package jfun;
import java.util.Scanner;
public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int num = sc.nextInt();
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num = num / 10;
		}
        System.out.println("sum of the digits" + sum);
	}

}
