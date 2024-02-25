package com.mustafa.Donguler.HarmonikSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        double toplam = 0.0;

        for(int i = 1; i <= sayi; i++)
        {
            toplam = toplam + (1.0 / i);
        }
        System.out.println("Harmonik sayı = " + toplam);

    }
}
