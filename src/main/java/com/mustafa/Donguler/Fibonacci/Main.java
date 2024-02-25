package com.mustafa.Donguler.Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();
        int ilkSayi = 0;
        int ikinciSayi = 1;
        for(int i = 1; i <= elemanSayisi; i++)
        {
            System.out.print(ilkSayi + " ");
            int sayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sayi;
        }

    }
}
