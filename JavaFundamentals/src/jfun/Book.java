package jfun;
import java.util.Scanner;
public class Book {
	private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public void printDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + qtyInStock);
        author.printDetails(); 
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Author Name: ");
	        String authorName = sc.nextLine();

	        System.out.print("Enter Author Email: ");
	        String authorEmail = sc.nextLine();

	        System.out.print("Enter Author Gender (M/F): ");
	        char gender = sc.next().charAt(0);
	        sc.nextLine(); 

	     
	        Author author = new Author(authorName, authorEmail, gender);

	        
	        System.out.print("Enter Book Name: ");
	        String bookName = sc.nextLine();

	        System.out.print("Enter Book Price: ");
	        double price = sc.nextDouble();
	        System.out.print("Enter Quantity in Stock: ");
	        int qty = sc.nextInt();

	       
	        Book book = new Book(bookName, author, price, qty);

	     
	        book.printDetails();



	}

}
