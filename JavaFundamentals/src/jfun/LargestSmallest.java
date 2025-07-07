package jfun;
import java.util.Arrays;
import java.util.Scanner;
public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of arrays:");
     int n = sc.nextInt();
     if(n < 4) {
    	 int[] arr = new int[n];
    	 System.out.println("Enter four elements");
    	 for(int i = 0 ; i < n; i++) {
    		 arr[i] = sc.nextInt();
    	 }
    	 Arrays.sort(arr);
    	 System.out.println("Smallest" + arr[0] + " ," + arr[1]);
    	 System.out.println("largest" + arr[n-2] + " ," + arr[n-1]); 
    	 
     }
     else {
    	 System.out.println("Please enter at least 4 elements.");
    	 
     }
	}

}
