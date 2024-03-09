package com.mustafa.Kosullu_Ifadeler_ve_Kod_Bloklari.EtkinlikOnerme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sicaklik ;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Sıcaklık giriniz: ");

        sicaklik= scanner.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }if (sicaklik>=5&&sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (sicaklik>=15&&sicaklik<=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        if (sicaklik>25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}
