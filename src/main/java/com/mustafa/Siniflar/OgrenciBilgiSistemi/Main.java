package com.mustafa.Siniflar.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen("Ahmet TAS", "0000", "TRH");
        Ogretmen ogretmen2 = new Ogretmen("Mehmet BAS", "1111", "FZK");
        Ogretmen ogretmen3 = new Ogretmen("Fatma NUR", "2222", "BIO");

        Ders tarih = new Ders("Tarih", "101", "TRH");
        tarih.ogretmenEkle(ogretmen1);
        Ders fizik = new Ders("Fizik", "102", "FZK");
        fizik.ogretmenEkle(ogretmen2);
        Ders biyo = new Ders("Biyoloji", "103", "BIO");
        biyo.ogretmenEkle(ogretmen3);

        Ogrenci ogrenci1 = new Ogrenci("Cem Yilmaz", "12345", "4", tarih, fizik, biyo);
        ogrenci1.notEkle(90, 70, 63);
        ogrenci1.gecmeDurumu();

        Ogrenci ogrenci2 = new Ogrenci("Eser Yenenler", "23456", "5", tarih, fizik, biyo);
        ogrenci2.notEkle(70, 40, 20);
        ogrenci2.gecmeDurumu();
    }
}
