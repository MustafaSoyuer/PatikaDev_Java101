package com.mustafa.Kosullu_Ifadeler_ve_Kod_Bloklari.CinZodyagi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        int dogumTarihi = scanner.nextInt();
        int sonuc = dogumTarihi % 12;

        switch(sonuc)
        {
            case 0:
                System.out.println("Çin Zodyağı: Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı: Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı: Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı: Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı: Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı: Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı: Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı: Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı: Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı: Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı: At");
                break;
            case 11:
                System.out.println("Çin Zodyağı: Koyun");
                break;
            default:
                System.out.println("Yanlış değer girdiniz!");
                break;
        }
    }
}
