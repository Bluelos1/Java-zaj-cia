package com.company;

public class Wiatrak {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    double speed;
    boolean on;
    double radius;
    String color;

    public Wiatrak() {
    }



    public Wiatrak(double speed,boolean on,double radius, String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    public void informacje(){
        System.out.println(speed+" "+on+" "+radius+" "+color);
    }
}