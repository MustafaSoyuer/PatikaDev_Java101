package com.mustafa.Donguler.GirilenSayiyaKadarOlanCiftSayilar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

		for(int i = 0; i <= sayi; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}

        // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
        // sayıların ortalamasını hesaplayan programı yazınız.

        int toplam = 0;
        int sayac = 0;
        for(int i = 0; i <= sayi; i++)
        {
            if((i % 3 == 0) && (i % 4 == 0))
            {
                toplam = toplam + i;
                sayac++;
            }
        }
        double ort = toplam / sayac;
        System.out.println("Ortalama: " + ort);
    }
}
