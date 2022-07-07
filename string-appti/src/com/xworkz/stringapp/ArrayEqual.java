package com.xworkz.stringapp;

public class ArrayEqual {
	public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] A = { {1,2,3}, {4,5,6} };
        int[][] B = { {4,5,6}, {7,8,9} };

        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
