package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*  float x = 9.5f;
        double y = 4.5;
        double z = 2.5;
        int h = 3;
        double j = 45.5;
        double k = 3.5;
        System.out.println("hello world");
        System.out.println((x * y - z * h)/(j - k)  );
        Scanner scanner = new Scanner (System.in);
        int liczba = scanner.nextInt();
        System.out.println((9/5.0) * liczba + 32 +"f" ); */
        /* System.out.println("kilometry    Mile");
        for (int i = 1; i<11; i++){
            System.out.println(  i +"           "+i * 1.609 ); */
      /*  System.out.println("podaj numer dnia tydognia :");
        Scanner scanner = new Scanner (System.in);
        int liczba = scanner.nextInt();
        switch(liczba){
            case 1:
                System.out.println("Poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
                */
      /* int[] tab = new int[6];
       tab[0] = 3;
        System.out.println(tab[0]);
       int[] tab2 = {3,4,5,6,7,8};*/
       /* Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int[] tab = new int[a];
        for (int i=0;i<a;i++) {
            int b = scanner.nextInt();
            tab[i]=b;
        }
        for (int i=0;i<a;i++) {
        System.out.println(tab[i]);
        } */
        /* Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] tab = new int[a];
        tab[0] = b;
        for (int i=1;i<a;i++) {
            boolean bool = true;
            while (bool) {
                if (++b % 2 == 0){
                    tab [i] = b;
                    bool = false;
                }
            }

        }
        System.out.println(Arrays.toString(tab));
        System.out.println(returnTheLowest(tab));
        System.out.println(returnTheHighest(tab));
        System.out.println(sum(tab));
        System.out.println(average(tab));
        System.out.println(mediana(tab));
    }

        */
       /* Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int nwd = 0;
        if(a>b){
            nwd=NWD(a,b);
        }
        else{
            nwd=NWD(b,a);
        }
        System.out.println(nwd);



    }
    public static int  returnTheLowest (int[] tab1){
        return tab1[0];
    }
    public static int  returnTheHighest (int[] tab1){
        return tab1[tab1.length - 1];
    }
    public static int  sum (int[] tab1){
        int suma =0;
        for(int j=0;j<tab1.length ;j++){
            suma = suma + tab1[j];
        }
        return suma;
    }
    public static double average  (int[] tab1){
        return (double) sum(tab1)/tab1.length;
    }
    public static double mediana  (int[] tab1) {
        if (tab1.length % 2 == 0) {
            int a = tab1[(tab1.length - 1) / 2];
            int b = tab1[tab1.length / 2];
            return (double) (a + b) / 2;
        }
        return (double) tab1[tab1.length / 2];
    }
    public static int NWD (int a, int b){
        //a jest zawsze większe od b
        int nwd = 1;
        for(int j = 1;j<=b;j++){
            if (a%j == 0 && b%j==0){
                nwd = j;
            }
        }
        return nwd;
    }
    public static void main(String[] args) {
        // write your code here
        MyCircle a = new MyCircle(2.4);
        Wiatrak b = new Wiatrak();
        b.informacje();
        Wiatrak c = new Wiatrak(5.5,true,4.8,"blue");
        c.informacje();

    }*/


}

}




