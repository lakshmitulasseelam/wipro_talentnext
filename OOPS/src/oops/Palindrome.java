package oops;
import java.util.Scanner;
class Palindrome {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        boolean isPalindrome = true;
	        int i = 0;
	        int j = input.length() - 1;

	        while (i < j) {
	            if (input.charAt(i) != input.charAt(j)) {
	                isPalindrome = false;
	                break;
	            }
	            i++;
	            j--;
	        }

	        if (isPalindrome) {
	            System.out.println(input + " is a palindrome");
	        } else {
	            System.out.println(input + " is not a palindrome");
	        }
	    }
	}



