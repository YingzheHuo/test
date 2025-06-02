package org.example;

public class Counter {
    static int globalCounter = 0;
    int instanceCounter = 0;

    public void increment() {
        globalCounter++;
        instanceCounter++;
    }
}
