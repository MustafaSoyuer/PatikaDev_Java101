package com.mustafa.Temel_Kavramlar_ve_Degiskenler.NotOrtalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
        // kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana yazdıran program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunu giriniz: ");
        double mat = scanner.nextDouble();
        System.out.println("Fizik notunu giriniz: ");
        double fizik = scanner.nextDouble();
        System.out.println("Kimya notunu giriniz: ");
        double kimya = scanner.nextDouble();
        System.out.println("Türkçe notunu giriniz: ");
        double turkce = scanner.nextDouble();
        System.out.println("Tarih notunu giriniz: ");
        double tarih = scanner.nextDouble();
        System.out.println("Müzik notunu giriniz: ");
        double muzik = scanner.nextDouble();
        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Not ortalaması: " + ort);


        // 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        // Not : If ve Else kullanmadan.

        String durum = (ort > 60) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println("Durum: " + durum);
    }

}
