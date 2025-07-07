package jfun;
import java.util.Arrays;
import java.util.Scanner;

public class MiddleWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		System.out.println("Enter three elements for array a:");
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter three elements for array b:");
		for(int i = 0; i < 3; i++) {
			b[i] = sc.nextInt();
		}
		int[] result = {a[1] , b[1]};
		System.out.println("Middle elements: " + Arrays.toString(result));
	}

}
