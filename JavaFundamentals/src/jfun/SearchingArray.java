package jfun;

import java.util.Scanner;

public class SearchingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i = 0; i < n ;i++) arr[i] = sc.nextInt();
		System.out.println("Enter element to search:");
		int index = -1;
		int  num = sc.nextInt();
		for(int i = 0; i< n; i++) {
			if (arr[i] == num) {
			index = i;
			break;
	        }

          }
System.out.println(index);
		}
}