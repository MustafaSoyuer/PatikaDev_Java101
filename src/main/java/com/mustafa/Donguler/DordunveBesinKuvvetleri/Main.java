package com.mustafa.Donguler.DordunveBesinKuvvetleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lütfen sayiyi giriniz :");
        sayi=scanner.nextInt();

        System.out.println("Dördün Kuvvetleri :");
        for (int i = 1; i <= sayi; i*=4) {
            if (i==1){
                continue;
            }
            System.out.println(i);

        }

        System.out.println("-----------");
        System.out.println("Beşin Kuvvetleri: ");
        for (int i = 1; i <=sayi  ; i*=5) {
            if (i==1){
                continue;
            }
            System.out.println(i);
        }

    }
}
