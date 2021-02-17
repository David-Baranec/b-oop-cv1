package com.company;

public class Main {

    public static void main(String[] args) {
        uloha1();
        System.out.println("Vrátilo mi:" + uloha2(10, 1));
        System.out.println("Vrátilo mi:" + uloha2(10, 10));
        System.out.println("Vrátilo mi:" + uloha2(1, 10));

        System.out.println("Vrátilo mi:" + uloha2alternativneRiesenie(10, 1));
        System.out.println("Vrátilo mi:" + uloha2alternativneRiesenie(10, 10));
        System.out.println("Vrátilo mi:" + uloha2alternativneRiesenie(1, 10));
    }

    static void uloha1() {
        System.out.println("Hello World");
    }

    static int uloha2(int prveCislo, int druheCislo) {
        if (prveCislo > druheCislo) {
            return 1;
        } else if (prveCislo == druheCislo) {
            return 0;
        } else {
            return -1;
        }
    }

    static int uloha2alternativneRiesenie(int prveCislo, int druheCislo) {
        return Integer.compare(prveCislo, druheCislo);
    }

}
