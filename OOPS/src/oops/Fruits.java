package oops;

public class Fruits {
    String name;
    String taste;
    String size;
    void eat(){
    	System.out.println("Fruit" + name + "Taste" + taste);
    }
}
class Apple extends Fruits {
	Apple(){
		name = "Apple";
		taste = "Sweet";
		size = "Medium";
	}
	@Override
	    void eat() {
		System.out.println(name + "Taste" + taste);
	}
}
class Orange extends Fruits{
	Orange(){
		name = "Orange";
		taste = "Sour";
		size = "Small";
	}
	@Override
	   void eat() {
		System.out.println(name + "Taste" +taste);
	}
	
}
class FruitsTest {
       public static void main(String[] args) {
	// TODO Auto-generated method stub
    	   Fruits f1 = new Apple();
    	   Fruits f2 = new Orange();
    	   
    	   f1.eat();
    	   f2.eat();
       }
}


