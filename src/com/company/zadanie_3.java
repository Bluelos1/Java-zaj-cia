package com.company;

public class zadanie_3 {
    public static void main(String[] args) {
        Punkt punkt =new Punkt(2,2);
        Punkt zerowy = new Punkt();
        punkt.wyswietl();
        zerowy.wyswietl();

        int a = Math.abs(punkt.x-zerowy.x);
        int b = Math.abs(punkt.y- zerowy.y);
        double dist = Math.sqrt(a*a+b*b);
        System.out.println(dist);
    }
}
