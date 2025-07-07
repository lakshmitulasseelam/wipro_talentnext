package jfun;
import java.util.Scanner;
public class Author {
    
	private String name;
	private String email;
    private char gender;
    
    public Author(String name, String email, char gender) {
    	this.name = name;
    	this.email = email;
    	this.gender = gender;
    }
    public void printDetails() {
        System.out.println("Author Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter author name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);
        
        Author author = new Author(name, email, gender);
        author.printDetails();

	}

}
