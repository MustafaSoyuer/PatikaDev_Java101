package com.mustafa.Donguler.Faktoriyel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Faktoriyel
        System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		int f = 1;

		for(int i = 1; i <= sayi; i++)
		{
			f = f * i;
		}
		System.out.println("Faktöriyel: " + f);


        // Kombinasyon
        System.out.println("Eleman sayısını giriniz: ");
        int eleman = scanner.nextInt();
        System.out.println("Küme sayısını giriniz: ");
        int kume = scanner.nextInt();
        int n = 1;
        int r = 1;
        int a = 1;

        for(int i = 1; i <= kume; i++)
        {
            n = n * i;
        }

        for(int i = 1; i <= eleman; i++)
        {
            r = r * i;
        }

        for(int i = 1; i <= (kume - eleman); i++)
        {
            a = a * i;
        }
        int c = n / (r * a);
        System.out.println("Kombinasyon: " + c);

    }
}
