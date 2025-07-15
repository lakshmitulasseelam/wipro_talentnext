
import java.util.Random;
import java.util.Random.*;
public abstract class Compartment {
	 public abstract String notice();
}
class FirstClass extends Compartment{
	@Override
	public String notice() {
	 return "First Class Compartment: Reserved for First Class passengers.";
	}
}
class Ladies extends Compartment{
	@Override
	public String notice() {
		return "Ladies Compartment : Reserved for only Ladies";
	}
}
class General extends Compartment{
	@Override
	public String notice() {
		return "General Compartment : open for all passengers";
	}
}
class Luggage extends Compartment{
	@Override
	public String notice() {
		return "Luggage Compartment : Only for luggage and parcels";
	}
}

 class TestCompartment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartment = new Compartment[10];
	    Random rand = new Random();
 
	    
	   for(int i = 0; i< compartment.length; i++) {
		   int choice = rand.nextInt(4) + 1;
		   switch (choice){
		   case 1:
			   compartment[i] = new FirstClass();
			   break;
		   case 2:
			   compartment[i] = new Ladies();
			   break;
		   case 3:
			   compartment[i] = new General();
			   break;
		   case 4:
			   compartment[i] = new Luggage();
			   break;
		   default:
			   compartment[i] = new General();
			   
		   }
		   
	   }
	   for(int i = 0; i < compartment.length; i++) {
		   System.out.println("compartment" + (i+1) +":" + compartment[i].notice());
	   }

	}

}
