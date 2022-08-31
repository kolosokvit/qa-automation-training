package org.kolosokvit.optional_task_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OptionalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size:");
        int matrixSize = scanner.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        System.out.println("Enter max value of matrix element:");
        int maxValue = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2 * maxValue + 1) - maxValue;
            }
        }
        System.out.println("Your matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        getMaxRowOfIncreasingElements(matrix);
        matrixColumnsInAscendingOrder(matrix);

    }

    // 1. Упорядочить столбцы матрицы в порядке возрастания значений элементов k-ой строки.

    public static void matrixColumnsInAscendingOrder(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length - 1; k++) {
                    if (matrix[k][i] > matrix[k + 1][i]) {
                        int swap = matrix[k + 1][i];
                        matrix[k + 1][i] = matrix[k][i];
                        matrix[k][i] = swap;
                    }
                }
            }
        }
        System.out.println("Your matrix is sorted:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. Найти и вывести наибольшее число возрастающих элементов матрицы, идущих подряд.

    public static void getMaxRowOfIncreasingElements(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }

        int count = 1;
        int resCount = 1;
        int index = 0;
        int resIndex = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) > list.get(i)) {
                count++;
            } else {
                if (count > resCount) {
                    resCount = count;
                    resIndex = index;
                }
                count = 1;
                index = i + 1;
            }
        }
        System.out.print("Max row of increasing elements: ");
        for (int i = 0; i < resCount; i++) {
            System.out.print(list.get(resIndex + i) + " ");
        }
        System.out.println();
    }
}
