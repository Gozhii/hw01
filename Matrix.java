package com.company.hw01;

import java.io.Serializable;
import java.util.Arrays;

public class Matrix implements Serializable, deepClonanble {
    private int[][] matrix;
    private boolean sorted;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        for (int index = 0; index < matrix.length; index++) {
            for (int element = 0; element < matrix[0].length; element++) {
                System.out.print(matrix[index][element] + " ");
            }
            System.out.println("\n");
        }
    }

    public int[] getDiagonal() {

        if (matrix.length != matrix[0].length) {
            System.out.println("Matrix is not square");
            return null;
        } else {
            int[] array = new int[matrix.length];
            for (int index = 0; index < matrix.length; index++) {
                array[index] = matrix[index][index];
            }

            for (int index = 0; index < array.length; index++) {
                System.out.print(array[index]);
            }
            return array;
        }
    }

    public int getMaxValue() {
        if (sorted == true) {
            return matrix[matrix.length - 1][matrix[0].length - 1];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int e = 0; e < matrix[0].length; e++) {
                if (matrix[i][e] > max) {
                    max = matrix[i][e];
                }
            }
        }
        return max;
    }

    public int getMinValue() {
        if (sorted == true) {
            return matrix[0][0];
        }
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < matrix.length; index++) {
            for (int element = 0; element < matrix[0].length; element++) {
                if (matrix[index][element] < min) {
                    min = matrix[index][element];
                }
            }
        }
        return min;
    }

    public static int[][] sort(Matrix matrix) {
        int[] arr = new int[matrix.matrix.length * matrix.matrix[0].length];
        int f = 0;
        for (int index = 0; index < matrix.matrix.length; index++) {
            for (int element = 0; element < matrix.matrix[0].length; element++) {
                arr[f] = matrix.matrix[index][element];
                f++;
            }
        }
        Arrays.sort(arr);
        f = 0;
        for (int index = 0; index < matrix.matrix.length; index++) {
            for (int element = 0; element < matrix.matrix[0].length; element++) {
                matrix.matrix[index][element] = arr[f];
                f++;
            }
        }
        matrix.sorted = true;
        return matrix.matrix;
    }

}
