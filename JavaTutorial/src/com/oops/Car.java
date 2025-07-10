package com.oops;

public class Car {
    private int speed;
    private String color;

    public Car(String color) {
       this.color = color;
    }

    public void speed(int speed) {
        if(speed < 0) {
            System.out.println("Not Possible to set speed to " + speed);
        }else {
            this.speed = speed;
            System.out.println("Speed is set to " + speed);
        }

    }

    void drive() {
        System.out.println("Driving");
    }
}
