package com.company;

public class Car {
    double speed;
    String name;
    @Override
    public String toString() {
        return this.name + " " + this.speed;
    }

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

}
