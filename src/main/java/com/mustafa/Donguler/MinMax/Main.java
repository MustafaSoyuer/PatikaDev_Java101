package com.mustafa.Donguler.MinMax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();
        System.out.println("1. sayıyı giriniz: ");
        int ilkSayi = scanner.nextInt();
        int enBuyuk = ilkSayi;
        int enKucuk = ilkSayi;

        for(int i = 2; i <= n; i++)
        {
            System.out.println(i + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if(sayi > enBuyuk)
            {
                enBuyuk = sayi;
            }

            if(sayi < enKucuk)
            {
                enKucuk = sayi;
            }

        }
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

    }
}
