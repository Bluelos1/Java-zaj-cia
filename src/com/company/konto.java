package com.company;

import java.util.Scanner;

public class konto {
    private static Object id;

    private static Object balance;

    public static void main(String[] args) {
        konto account [] = new konto[4];

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        int choice = scanner.nextInt();
        System.out.println("enter an id:"+ id + "[ENTER]\n" );
        System.out.println("Main menu\n1.:check balance\n2.:withdraw\n3.deposit\n4.exit");
        System.out.println("Enter a choice:"+choice+"[ENTER]\n");
        System.out.println("the balance is "+konto.balance);
    }
}
