package oops;
import java.util.Scanner;
public class RemoveX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String name");
		String str = sc.nextLine();
		sc.close();
		if (str.startsWith("x")) {
			str = str.substring(1);
		}
		if (str.endsWith("x")) {
			str = str.substring(0, str.length() -1);
		}
		
        System.out.println(str);
	}

}
