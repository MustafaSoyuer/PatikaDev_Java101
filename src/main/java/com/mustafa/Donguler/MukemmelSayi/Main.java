package com.mustafa.Donguler.MukemmelSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0)
            {
                toplam = toplam + i;
            }
        }
        if(toplam == sayi)
        {
            System.out.println(sayi + " mükemmel sayıdır.");
        }
        else
        {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
