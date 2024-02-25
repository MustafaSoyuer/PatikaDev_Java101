package com.mustafa.Donguler.TekSayilarinToplami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul
        // eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayi;

		do
		{
			System.out.println("Değer giriniz: ");
			sayi = scanner.nextInt();
			if(sayi % 2 == 1)
			{
				toplam = toplam + sayi;
			}
		} while(sayi >= 0);

		System.out.println("Negatif değer girilene kadar olan sayilardan, tek sayilarin toplami: " + toplam);

        // Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan
        // programı yazıyoruz.

        int toplam1 = 0;
        int sayi1;

        do
        {
            System.out.println("Sayi giriniz: ");
            sayi1 = scanner.nextInt();
            if(sayi1 % 4 == 0)
            {
                toplam1 = toplam1 + sayi1;
            }
        }while(sayi1 % 2 == 0);

        System.out.println("Toplam: " + toplam1);

    }
}
