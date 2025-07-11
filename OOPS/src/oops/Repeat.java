package oops;

import java.util.Scanner;

class Repeat {

 String repeatFirstTwo(String str) {
     int length = str.length();
     if (length == 0) {
         return "";
     }

     String part = length < 2 ? str : str.substring(0, 2);
     StringBuilder result = new StringBuilder();

    
     for (int i = 0; i < length; i++) {
         result.append(part);
     }

     return result.toString();
 }
}

class RepeatFirstTwo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

   
     System.out.print("Enter a string: ");
     String input = scanner.nextLine();
     scanner.close();


     Repeat r = new Repeat();
     String output = r.repeatFirstTwo(input);

   
     System.out.println("Result: " + output);
 }
}

