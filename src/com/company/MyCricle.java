package com.company;


public class MyCircle {
    double radius;

    public MyCircle(double radius){
        this.radius  = radius;
    }
    public double obwod(){
        return 2*Math.PI * radius;

    }
    public double pole(){
        return Math.PI * Math.pow(radius,2);
    }
    public double srednica(){
        return radius * 2;
    }
}