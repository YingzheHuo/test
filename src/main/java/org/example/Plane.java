package org.example;

public class Plane extends Vehicle implements Flyable {
    public Plane() {
        super("Plane");
    }

    @Override
    public void fly() {
        System.out.println("Plane flying");
    }

    @Override
    public void showTheSpeed() {
        System.out.println("Plane show the speed");
    }
}
