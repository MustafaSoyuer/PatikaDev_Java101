package com.mustafa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("0 ile 100 arasında bir sayı tahmin ediniz: ");
        Random random = new Random();
        int sayi = random.nextInt(100);
        int hak = 0;
        int tahmin;
        boolean kazanma = false;
        boolean kaybetme = false;
        int[] hata = new int[8];

        while(hak < 8)
        {
            tahmin = scanner.nextInt();

            if(tahmin < 0 || tahmin > 99)
            {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz!");
                if(kaybetme)
                {
                    hak++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (8 - hak));
                }
                else
                {
                    kaybetme = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if(tahmin == sayi)
            {
                System.out.println("Tebrikler doğru tahmin:)");
                kazanma = true;
                break;
            }
            else
            {
                if(tahmin > sayi)
                {
                    System.out.println("Lütfen daha küçük bir sayı giriniz: ");
                }
                else
                {
                    System.out.println("Lütfen daha büyük bir sayı giriniz: ");
                }

                hata[hak++] = tahmin;
                System.out.println("Kalan hak: " + (8 - hak));
            }
        }

        if(!kazanma)
        {
            System.out.println("Kaybettiniz! ");
            if(!kaybetme)
            {
                System.out.println("Tahminleriniz: " + Arrays.toString(hata));
            }
        }

    }
}
