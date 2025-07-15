
public class Car implements Vehicle, FourWheeler {
	@Override
	public void message() {
		Vehicle.super.message();
		FourWheeler.super.message();
		System.out.println("Inside Car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.message();

	}

}
