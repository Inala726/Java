package org.aptech.OOP;

public abstract class Car {
    public void drive() {
        System.out.println("Vehicle can either be automatic or manual driven");
    }

    public abstract int acceleration(int currentSpeed);

}
