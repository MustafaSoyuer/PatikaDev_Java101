package com.mustafa.Metotlar.RecursiveileAsalSayi;

import java.util.Scanner;

public class Main {
    static boolean asal(int a)
    {
        boolean asal = true;
        if(a < 2)
        {
            asal = false;
        }
        else
        {
            for(int i = 2; i < Math.sqrt(a); i++)
            {
                if(a % i == 0)
                {
                    asal = false;
                    break;
                }
            }
        }
        return asal;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if(asal(sayi) == true)
        {
            System.out.println(sayi + " sayısı asaldır.");
        }
        else
        {
            System.out.println(sayi + " sayısı asal değildir.");
        }
    }
}
