package com.mustafa.Kosullu_Ifadeler_ve_Kod_Bloklari.HesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir seçim yapınız:\n1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
        int secim = scanner.nextInt();
        System.out.println("Birinci sayıyı giriniz: ");
        double a = scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        double b = scanner.nextDouble();

        // Hesap makinesini switch-case kullanarak yapınız.

        switch(secim)
        {
            case 1:
                System.out.println("Toplam: " + (a + b));
                break;
            case 2:
                System.out.println("Fark: " + (a - b));
                break;
            case 3:
                System.out.println("Çarpım: " + (a * b));
                break;
            case 4:
                if(b == 0)
                {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }
                else
                {
                    System.out.println("Bölüm: " + (a / b));
                }
            default:
                System.out.println("Yanlış seçim yaptınız! Tekrar deneyiniz.");
                break;
        }


    }
}
