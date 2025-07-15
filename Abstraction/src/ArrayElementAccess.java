import java.util.Scanner;
public class ArrayElementAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number of elements");
			int size = Integer.parseInt(sc.nextLine());
			int [] arr = new int[size];
			System.out.println("Enter the index of the array");
			int index = Integer.parseInt(sc.nextLine());
			
			System.out.println("Array element at index" + index +"=" +arr[index]);
			System.out.println("Array element succesfully");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
           sc.close();
	}

}
