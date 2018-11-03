package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        zgaduj(losuj());

    }

    static int losuj() {
        Random r = new Random();
        int x = r.nextInt(100) + 1;

        return x;
    }

    static void zgaduj(int x) {

        Scanner scan = new Scanner(System.in);
        int a = 0;
        int licznik = 0;
        do {
            System.out.print("Zgadnij liczbe: ");
            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("Podałeś złe dane");
            }
            a = scan.nextInt();

            if (a < x) {
                System.out.println("Za mało");
                licznik++;
            } else {
                System.out.println("Za dużo");
                licznik++;
            }
        } while (a != x);

        System.out.println("Zgadłeś, to jest ta liczba");
        System.out.println("Ilość prób: " + licznik);
    }
}