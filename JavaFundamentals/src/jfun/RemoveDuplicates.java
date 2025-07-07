package jfun;
import java.util.Scanner;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		if(n > 0) {
			int[] arr = new int[n];
			System.out.println("Enter" + n + "elements");
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			Set<Integer> set = new LinkedHashSet<>();
			for(int num : arr) {
				set.add(num);
			}
			System.out.println("Array" + set);
		}
		else {
			System.out.println("size");
		}

	}

}
