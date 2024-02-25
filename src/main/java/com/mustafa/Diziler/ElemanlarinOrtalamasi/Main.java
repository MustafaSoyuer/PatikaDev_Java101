package com.mustafa.Diziler.ElemanlarinOrtalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int n = scanner.nextInt();
        double harmonikSeri = 0;
        for(int i = 1; i <= n; i++)
        {
            harmonikSeri += 1.0 / i;
        }
        double ort = n / harmonikSeri;
        System.out.println("Ortalama: " + ort);

    }
}
