package com.mustafa.Temel_Kavramlar_ve_Degiskenler.Taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz: (KM)");
        double mesafe = scanner.nextDouble();
        int acilisUcreti = 10;
        double tutar = acilisUcreti + (mesafe * 2.20);
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Taksimetre tutarı: " + tutar);}
}
