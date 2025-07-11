package oops;
import java.util.Scanner;
public class RemoveFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Name");
		String str = sc.nextLine();
		sc.close();
        if(str.length() > 2) {
        	System.out.println(str.substring(1,str.length() -1));
        }
        else {
        	System.out.println("");
        }
	}

}
