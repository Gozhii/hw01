package com.company;

import com.company.hw01.*;

public class Main {

    public static void main(String[] args) {

        Romb task2 = new Romb();
        task2.printRomb(10);

        int[][] array = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        Matrix matrix = new Matrix(array);
        matrix.printMatrix();
        System.out.println(matrix.getMaxValue());
        matrix = new Matrix(Matrix.sort(matrix));

        Matrix new_matrix = matrix;
        System.out.println(new_matrix.hashCode() + ", " + matrix.hashCode());
        System.out.println(new_matrix.getDiagonal().hashCode() + ", " + matrix.getDiagonal().hashCode());


        MathFunction pow = new MathFunction();
        System.out.println(pow.getPow(3, 0));

        Sort sort = new Sort();
        int[] arr = sort.bubleSort(new int[]{2, 3, 4, 1, 5});
        for (int a : arr) {
            System.out.println(a);
        }


    }

}
