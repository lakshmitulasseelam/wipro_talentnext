package oops;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringJoiner; 
public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of names");
		int n = sc.nextInt();
		sc.nextLine();
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	System.out.println("Enter" + (i + 1) + ":");
        	String name = sc.nextLine();
        	names.add(name);
        }
        sc.close();
        
        StringJoiner sj = new StringJoiner(", ", "{", "}");
        for (String name : names) {
            sj.add(name);
        }

        System.out.println("Joined Names: " + sj);
        
	}

}
