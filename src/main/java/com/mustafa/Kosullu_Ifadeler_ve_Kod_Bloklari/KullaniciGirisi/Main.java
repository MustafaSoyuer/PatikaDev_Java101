package com.mustafa.Kosullu_Ifadeler_ve_Kod_Bloklari.KullaniciGirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yazın.

        String kullaniciAdi = "patika";
        String dogruSifre = "java123";
        String sifre = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String girilenKullaniciAdi = scanner.nextLine();

        System.out.print("Sifre: ");
        String girilenSifre = scanner.nextLine();

        if (girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı!");
        } else if (girilenKullaniciAdi.equals(kullaniciAdi)) {
            System.out.print("Sifreniz yanlış. sifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String sifreSifirla = scanner.nextLine();

            if (sifreSifirla.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni Sifre: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(girilenSifre) || yeniSifre.equals(dogruSifre)) {
                    System.out.println("Sifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Sifre oluşturuldu.");
                }
            } else {
                System.out.println("Sifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }


    }
}
