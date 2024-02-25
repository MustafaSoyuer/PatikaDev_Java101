package com.mustafa.Donguler.EbobEkok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        int kucukSayi;
        int buyukSayi;
        int ebob = 0;
        int ekok = 0;

        if(sayi1 < sayi2)
        {
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        }
        else
        {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        }

        for(int i = 1; i <= kucukSayi; i++)
        {
            if(kucukSayi % i == 0 && buyukSayi % i == 0)
            {
                ebob = i;
            }
        }
        System.out.println("EBOB: " + ebob);

        for(int i = 1; i <= kucukSayi * buyukSayi; i++)
        {
            if(i % kucukSayi == 0 && i % buyukSayi == 0)
            {
                ekok = i;
                break;
            }
        }
        System.out.println("EKOK: " + ekok);

    }
}
