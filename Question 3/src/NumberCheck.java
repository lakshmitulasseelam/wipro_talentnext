import java.util.Scanner;
public class NumberCheck {

	public static void CheckNumber(int num) {
		// TODO Auto-generated method stub
		if (num > 0) {
			System.out.println(num + "positive");
		}
		else if (num > 0) {
			System.out.println(num + "negative");
		}
		else {
			System.out.println(num + "Zero");
		}
	}
      public static boolean lastDigit(int a , int b) {
    	  return (a%10)==(b%10);
      
	}
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    		 int number = sc.nextInt();
    		 System.out.println("Enter an integer number");
    	     int num = sc.nextInt();
    	     CheckNumber(number);
    	     
    	     System.out.println("Enter first non-negative number");
    	     int num1 = sc.nextInt();
    	     System.out.println("Enter second non negative number");
    	     int num2 =sc.nextInt();
    	     
    	     if(num1 < 0 || num2 < 0 ) {
    	    	 System.out.println("Please enter non-negative integers only.");
    	     }
    	     else {
    	    	 boolean result = lastDigit(num1, num2);
    	            System.out.println("Do " + num1 + " and " + num2 + " have the same last digit? " + result);
    	     }
    	     sc.close();
      }

}
