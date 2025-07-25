import java.util.*;

public class PrimeLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		Random ran = new Random();
		for(int i = 0; i < 25; i++) {
			al.add(ran.nextInt(100) + 1);
			
		}
		System.out.println("All numbers:" + al);
		System.out.println("Prime numbers:");
		al.stream()
		  .filter(n -> isPrime(n))
		  .forEach(null);
  
	}

}
