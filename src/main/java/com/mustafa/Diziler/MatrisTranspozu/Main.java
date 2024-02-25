package com.mustafa.Diziler.MatrisTranspozu;

public class Main {
    public static void main(String[] args) {

        int[][] matris = {{2, 3, 4},
                {5, 6, 4}};
        int[][] transpozeMatris = new int[matris[0].length][matris.length];

        for(int i = 0; i < matris[0].length; i++)
        {
            for(int j = 0; j < matris.length; j++)
            {
                transpozeMatris[i][j] = matris[j][i];
            }
        }

        for(int i = 0; i < transpozeMatris.length; i++)
        {
            for(int j = 0; j < transpozeMatris[i].length; j++)
            {
                System.out.print(transpozeMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
