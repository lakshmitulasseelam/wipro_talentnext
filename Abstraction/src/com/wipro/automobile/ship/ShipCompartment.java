

package com.wipro.automobile.ship;

public class ShipCompartment {
    private int height;
    private int width;
    private int breadth;

    public ShipCompartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Ship Compartment Dimensions:");
        System.out.println("Height: " + height + ", Width: " + width + ", Breadth: " + breadth);
    }
}
