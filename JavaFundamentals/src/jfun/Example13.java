package jfun;
import java.util.Scanner;
public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];
        System.out.println("Enter 4 integer:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        System.out.println("The reverse of the array is:");
        for (int i = 1; i >= 0; i--) {
            System.out.println(arr[i][1] + " " + arr[i][0]);
        }

	}

}
