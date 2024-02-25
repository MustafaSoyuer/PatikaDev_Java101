package com.mustafa.Temel_Kavramlar_ve_Degiskenler.DikUcgendeHipotenus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci dik kenar uzunlunluğunu giriniz: ");
		int x = scanner.nextInt();
        System.out.println("İkinci dik kenar uzunlunluğunu giriniz: ");
        int y = scanner.nextInt();
		double z = Math.sqrt((x * x) + (y * y));
		System.out.println("Hipotenüs: " + z);


        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.


        System.out.println("Üçgenin kenar uzunluklarını giriniz: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + alan);


    }
}
