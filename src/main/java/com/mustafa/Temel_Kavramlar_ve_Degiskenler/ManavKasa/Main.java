package com.mustafa.Temel_Kavramlar_ve_Degiskenler.ManavKasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız? ");
        int kgArmut = scanner.nextInt();
        System.out.println("Kaç kilo elma aldınız? ");
        int kgElma = scanner.nextInt();
        System.out.println("Kaç kilo domates aldınız? ");
        int kgDomates = scanner.nextInt();
        System.out.println("Kaç kilo muz aldınız? ");
        int kgMuz = scanner.nextInt();
        System.out.println("Kaç kilo patlıcan aldınız? ");
        int kgPatlican = scanner.nextInt();
        double total = (kgArmut * 2.14) + (kgElma * 3.67) + (kgDomates * 1.11) + (kgMuz * 0.95) + (kgPatlican * 5.00);
        System.out.println("Toplam tutar: " + total);

    }
}
