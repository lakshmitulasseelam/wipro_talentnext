package jfun;
import java.util.Scanner;
import java.util.Arrays;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter size of array:");
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 int[] result = new int[n];
		 int index = 0;
		 System.out.println("Enter " + n + "elements:");
		 for(int i = 0; i < n; i++) {
			 if(arr[i] % 2 == 0) {
				 result[index++] = arr[i];
			 }
		 }
		 System.out.println("Rearranged" + Arrays.toString(result));
	}

}
