package oops;
import java.util.Optional;
import java.util.Scanner;
public class Option {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String  str = sc.nextLine().trim();
		sc.close();
		String name = str.isEmpty() ? null : str;
        Optional<String> optionalName = Optional.ofNullable(name);
        if(optionalName.isPresent()) {
        	System.out.println("Name : " + optionalName.get());
        } else {
        	System.out.println("NO Name");
        }
        String result = optionalName.orElse("Default Name");
        System.out.println("Result using orElse: " + result);
	}

}
