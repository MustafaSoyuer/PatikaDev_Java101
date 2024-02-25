package com.mustafa.Metotlar.RecursiveileUsluSayi;

import java.util.Scanner;

public class Main {
    static int us(int a, int b)
    {
        int sonuc = 1;
        for(int i = 1; i <= b; i++)
        {
            sonuc = sonuc * a;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban sayıyı giriniz: ");
        int taban = scanner.nextInt();
        System.out.println("Üssü giriniz: ");
        int us = scanner.nextInt();

        System.out.println("Sonuç: " + us(taban, us));
    }
}
