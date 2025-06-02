package org.example;

public class Box<T> {
    T value;

    public void setValue(T v) {
        value = v;
    }

    public T getValue() {
        return value;
    }

}
