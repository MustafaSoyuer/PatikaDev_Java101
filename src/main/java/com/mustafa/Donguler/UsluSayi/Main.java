package com.mustafa.Donguler.UsluSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban sayıyı giriniz: ");
        int taban = scanner.nextInt();
        System.out.println("Üssünü giriniz: ");
        int us = scanner.nextInt();
        int sonuc = 1;

		for(int i = 1; i <= us; i++)
		{
			sonuc = sonuc * taban;
		}
		System.out.println("Sonuç: " + sonuc);

    }
}
