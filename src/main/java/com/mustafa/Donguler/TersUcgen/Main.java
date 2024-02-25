package com.mustafa.Donguler.TersUcgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz: ");
        int bs = scanner.nextInt();

        for(int i = bs; i >= 1; i--)
        {
            for(int j = 0; j < bs - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = satirSayisi; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
