import java.io.*;
import java.util.Scanner;
public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter the output file name: ");
        String outputFile = scanner.nextLine();

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File is copied.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
	}

}
