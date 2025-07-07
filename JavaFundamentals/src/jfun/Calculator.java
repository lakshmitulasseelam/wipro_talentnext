package jfun;
import java.util.Scanner;
public class Calculator {
   
	public static void powerInt(int n1, int n2) {
		int res = (int) Math.pow(n1,n2);
		System.out.println(n1 + "^" + n2 + "=" + res);
	}
	public static void powerDouble(double n1, int n2) {
		double res = Math.pow(n1,  n2);
		System.out.println(n1 +"^" + n2 + "=" + res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter two integers: ");
	        int intBase = sc.nextInt();
	        int intExp = sc.nextInt();
	        powerInt(intBase, intExp);
	        
	        System.out.print("Enter a double and an integer: ");
	        double doubleBase = sc.nextDouble();
	        int doubleExp = sc.nextInt();
	        powerDouble(doubleBase, doubleExp);

	}

}
