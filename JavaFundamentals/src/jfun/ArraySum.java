package jfun;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
       double avg = (double) sum/n;
       System.out.println("sum" +sum);
       System.out.println("avg"+avg);
	}

}
