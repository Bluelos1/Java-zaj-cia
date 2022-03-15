package com.company;

public class Punkt {
    int x;
    int y;



    public Punkt(){}

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void wyswietl(){
        System.out.printf("(%d, %d)", x,y);
    }


}
