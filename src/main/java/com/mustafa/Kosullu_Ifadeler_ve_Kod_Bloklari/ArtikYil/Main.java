package com.mustafa.Kosullu_Ifadeler_ve_Kod_Bloklari.ArtikYil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yılı giriniz: ");
        int yil = scanner.nextInt();

        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0))
        {
            System.out.println(yil + " artık yıldır.");
        }
        else
        {
            System.out.println(yil + " artık yıl değildir.");
        }

    }
}
