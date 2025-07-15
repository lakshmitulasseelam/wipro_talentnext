
public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = (a, b, c) -> a + b + c;
		Test t2 = (a, b, c) -> a * b* c;
		int sumResult = t1.myFunction(10, 20, 30);
		int productResult = t2.myFunction(2, 6, 5);
		System.out.println("Sum = " + sumResult);
		System.out.println("product = " + productResult);

	}

}
