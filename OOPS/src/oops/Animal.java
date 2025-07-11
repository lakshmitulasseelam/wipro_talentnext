package oops;
import java.util.Scanner;
public class Animal {
    
    void eat() {
    	System.out.println("Animal is eating");
    }
    void sleep() {
    	System.out.println("Animal is sleeping");
    }
    class Bird extends Animal{
    	void eat() {
    		System.out.println("Bird is peeking");
    	}
    	void sleep() {
    		System.out.println("Bird is sleeping");
    	}
    	void fly() {
    		System.out.println("Bird is flying");
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Animal or 2 for Bird:");
		int choice =  sc.nextInt();
		
		if (choice == 1) {
            Animal animal = new Animal();
            animal.eat();
            animal.sleep();
        }

        if (choice == 2) {
        	Animal.Bird bird = new Animal().new Bird();
            bird.eat();
            bird.sleep();
            bird.fly();
        }
		

	}

}
