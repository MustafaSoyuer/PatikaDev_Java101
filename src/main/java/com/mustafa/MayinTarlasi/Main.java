package com.mustafa.MayinTarlasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the array: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of column of the array: ");
        int col = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,col);

        mineSweeper.run();

    }
}
