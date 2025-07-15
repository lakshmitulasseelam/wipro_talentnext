import java.util.Scanner;
public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Student name : ");
			String name = sc.nextLine();
			int[] marks = new int[3];
			int sum = 0;
			for(int i = 0; i < 3; i++) {
				System.out.println("Enter marks for subject " + (i + 1) + ":");
			     String input = sc.nextLine();
			     int mark = Integer.parseInt(input);
			     
			     if(mark < 0) throw new NegativeValueException("Marks cannot be negative.");
			     if(mark > 100) throw new OutOfRangeException("Marks must be between 0 and 100");
			     
			     marks[i] = mark;
			     sum += mark;
			
			
			}
			
			double average  = sum / 3.0;
			System.out.println("Average marks of " + name + ":" + average);
					
		} catch(NumberFormatException e) {
			System.out.println("please enter only integer values");
		}catch(NegativeValueException | OutOfRangeException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
