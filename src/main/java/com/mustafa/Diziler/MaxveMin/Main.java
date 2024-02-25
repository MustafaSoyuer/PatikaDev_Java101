package com.mustafa.Diziler.MaxveMin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        int kucukSayi = 0;
        int buyukSayi = 0;
        for(int i : dizi)
        {
            if(i < sayi)
            {
                kucukSayi = i;
            }
        }
        for(int j : dizi)
        {
            if(j > sayi)
            {
                buyukSayi = j;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukSayi);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukSayi);

    }
}
