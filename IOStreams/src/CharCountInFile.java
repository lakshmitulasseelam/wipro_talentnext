import java.io.*;
import java.util.Scanner;

public class CharCountInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the character to be counted: ");
        char inputChar = scanner.nextLine().toLowerCase().charAt(0);
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.toLowerCase((char) ch) == inputChar) {
                    count++;
                }
            }
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + inputChar + "'.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

	}

}
