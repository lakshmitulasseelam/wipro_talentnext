
public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   if (args.length != 5) {
    		   throw new IllegalArgumentException("Exactly 5 integers");
    	   }
    	   int[] arr = new int[5];
    	   int sum = 0;
    	   for(int i = 0; i < 5; i++) {
    		   arr[i] = Integer.parseInt(args[i]);
    		   sum += arr[i];
    	   }
    	   double average = sum / 5.0;
    	   System.out.println("Sum = " + sum);
    	   System.out.println("Average = " + average);
       } catch (NumberFormatException e) {
    	   System.out.println("NumberFormatException : Please enter vaild integer");
       } catch (ArithmeticException e) {
    	   System.out.println("ArithmeticException:" + e);
       } catch (IllegalArgumentException e) {
    	   System.out.println("Error:" + e.getMessage());
       }
	}

}
