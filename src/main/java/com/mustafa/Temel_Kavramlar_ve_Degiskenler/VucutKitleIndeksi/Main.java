package com.mustafa.Temel_Kavramlar_ve_Degiskenler.VucutKitleIndeksi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz(kg): ");
        double kilo = scanner.nextDouble();
        double vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
}
