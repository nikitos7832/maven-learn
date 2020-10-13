package com.epam.automation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class FundamentalsOptionalTask2 {
    public static void sortMatrixByColumn(int matrix[][], final int columnIndex)
    {
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(final int[] row1, final int[] row2) {
                if (row1[columnIndex] > row2[columnIndex])
                    return 1;
                else
                    return -1;
            }
        });
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 1000, k = 0;
        System.out.println("Enter n:");
        if (scanner.hasNextInt()){
            n = scanner.nextInt();
        }
        System.out.println("Enter M:");
        if (scanner.hasNextInt()){
            m = scanner.nextInt();
        }
        System.out.println("Enter k:");
        if (scanner.hasNextInt()){
            k = scanner.nextInt();
        }
        Random random = new Random();
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = random.nextInt(m);
            }
        }
        System.out.println("Unsorted matrix with random numbers:");
        for (int[] row:
             matrix) {
            for (int element:
                 row) {
                System.out.print(element+"  ");
            }
            System.out.println();
        }
        sortMatrixByColumn(matrix, k);
        System.out.printf("Sorted matrix by %d column:\n", k);
        for (int[] row:
                matrix) {
            for (int element:
                    row) {
                System.out.print(element+"  ");
            }
            System.out.println();
        }
    }
}
