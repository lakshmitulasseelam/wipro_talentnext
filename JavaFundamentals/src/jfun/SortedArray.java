package jfun;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n > 0) {
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Array size must be greater than 0.");
        }

	}

}
