package jfun;
import java.util.Scanner;
public class Only {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        
		int[] arr = new int[n];
		boolean vaild = true;
		System.out.println("Enter" + n +"elements");
		for(int i=0 ; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] != 1 && arr[i] != 4) {
				vaild = false;
			}
		}
		System.out.println(vaild);

	}

}
