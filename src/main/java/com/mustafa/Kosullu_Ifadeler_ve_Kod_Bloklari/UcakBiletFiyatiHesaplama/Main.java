package com.mustafa.Kosullu_Ifadeler_ve_Kod_Bloklari.UcakBiletFiyatiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz(KM): ");
        double mesafe = scanner.nextDouble();
        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz(Tek yön -> 1, Gidiş-Dönüş -> 2)");
        int tip = scanner.nextInt();
        double toplamFiyat = mesafe * 0.10;
        if(mesafe > 0 && yas > 0 && tip > 0 && tip <=2)
        {
            if(yas <= 12)
            {
                toplamFiyat = toplamFiyat - (toplamFiyat * 0.50);
            }
            else if(yas > 12 && yas < 24)
            {
                toplamFiyat = toplamFiyat - (toplamFiyat * 0.10);
            }
            else if(yas > 65)
            {
                toplamFiyat = toplamFiyat - (toplamFiyat * 0.30);
            }
            if(tip == 2)
            {
                toplamFiyat = (toplamFiyat * 2) - (2 * (toplamFiyat * 0.20));
            }
            System.out.println("Uçak bileti: " + toplamFiyat);
        }
        else
        {
            System.out.println("Hatalı veri girdiniz!");
        }

    }
}
