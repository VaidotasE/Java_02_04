package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk du skaicius: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Suma: " + suma(a, b));
        System.out.println("Skirtumas: " + skirtumas(a, b));
    }

        public static int suma(int a, int b) {
        return a + b;
    }

        public static int skirtumas(int a, int b) {
        return a - b;
    }
}
