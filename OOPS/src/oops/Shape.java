package oops;
import java.util.*;
 class Shape {
     void draw() {
    	 System.out.println("Drawing Shape");
     }
     void eraser() {
    	 System.out.println("Erasing Shape");
 }
     }
     class Circle extends Shape {
    	 @Override
    	 void draw() {
    		 System.out.println("Drawing Circle");
    	 }
    	 void eraser() {
    		 System.out.println("Erasing Circle");
    	 }
     }
     class Traingle extends Shape {
    	 @Override
    	 void draw() {
    		 System.out.println("Drawing Traingle");
    	 }
    	 void eraser() {
    		 System.out.println("Erasing Traingle");
    	 }
     }
 class Square extends Shape{
	 void draw() {
		 System.out.println("Drawing circle");
	 }
	 void eraser() {
		 System.out.println("Erasing Circle");
	 }
 } 
 
 class ShapeTest{
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle();
		Shape t = new Traingle();
		Shape s = new Square();
		
		
		c.draw(); c.eraser();
		t.draw(); t.eraser();
		s.draw(); s.eraser();

	 }
 }
 


