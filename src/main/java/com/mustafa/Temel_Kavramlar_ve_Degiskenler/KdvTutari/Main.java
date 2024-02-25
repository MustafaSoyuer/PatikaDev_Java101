package com.mustafa.Temel_Kavramlar_ve_Degiskenler.KdvTutari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana yazdıran program

        double tutar;
        System.out.println("Lütfen tutarı giriniz.");
        Scanner scanner = new Scanner(System.in);
        tutar = scanner.nextDouble();
        System.out.println("Kdvsiz fiyat:" + tutar);
        System.out.println("Kdv tutarı :" + tutar * 18 / 100);
        System.out.println("Kdvli fiyat :" + (tutar * 18 / 100 + tutar));

        // Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını
        // %8 olarak KDV tutarı hesaplayan programı yazınız.

        if (tutar > 0 &&tutar < 1000) {
            System.out.println("Yüzde 18'li Kdvli tutar :" + (tutar * 18 / 100 + tutar));
        } else
            System.out.println("Yüzde 8'li Kdvli tutar :" + (tutar * 8 / 100 + tutar));


    }
}
