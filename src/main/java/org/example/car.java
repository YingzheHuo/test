package org.example;

public class car extends Vehicle {
    public car() {
        super("car");
    }

    @Override
    public void showTheSpeed() {
        System.out.println("car show the speed");
    }
}
