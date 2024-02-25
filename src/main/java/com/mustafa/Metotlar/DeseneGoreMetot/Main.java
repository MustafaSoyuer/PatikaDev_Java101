package com.mustafa.Metotlar.DeseneGoreMetot;

import java.util.Scanner;

public class Main {
    static int recursive(int a, int b) {
        if (a <= 0) {
            return recursive1(a,b);}

        System.out.print(a + " ");
        return recursive(a - 5, b);



    }
    static int recursive1(int x, int z){
        if (x==z){
            return x;
        }
        System.out.print(x+" ");
        return recursive1(x+5,z);
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scanner =new Scanner(System.in);
        System.out.println("N sayısı : ");
        b=scanner.nextInt();
        a=b;
        System.out.println(recursive(a,b));
    }
}
