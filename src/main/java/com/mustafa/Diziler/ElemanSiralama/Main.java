package com.mustafa.Diziler.ElemanSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i = 0; i < dizi.length; i++)
        {
            dizi[i] = scanner.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println("Sıralama: " + Arrays.toString(dizi));

    }
}
