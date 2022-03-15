package com.company;

public class zadanie_drugie {
    public static void main(String[] args) {
        kwadrat kwadrat = new kwadrat(5);
        System.out.println("pole: " + kwadrat.pole());
        System.out.println("obwod: " + kwadrat.obwod());

        kwadrat kwadrat_drugi = new kwadrat (2);
        System.out.println(kwadrat_drugi.pole());
    }
}
