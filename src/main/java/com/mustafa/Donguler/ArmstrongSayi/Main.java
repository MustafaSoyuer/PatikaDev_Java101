package com.mustafa.Donguler.ArmstrongSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        int basamakSayisi;
        int toplam = 0;

        while(sayi != 0)
        {
            basamakSayisi = sayi % 10;
            toplam = toplam + basamakSayisi;
            sayi = sayi / 10;
        }
        System.out.println("Toplam: " + toplam);

    }
}
