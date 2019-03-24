package com.company;

import com.company.hw01.*;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Task1 task1 = new Task1();
        System.out.println(task1.resoltOfMatch(2,2, 3, 3));

        Task2 task2 = new Task2();
        task2.printRomb(10);

        Task3 task3 = new Task3();
        System.out.println(task3.getPow(4, 2.1));

        Task4 task4 = new Task4();
        System.out.println(task4.getCosTaylorSeries(1, (float) 6.283));
        System.out.println(task4.getSinTaylorSeries(1, (float) 6.283));

        int[] arr = new int[100];
        int e = 100;
        for(int i = 0; i < arr.length; i++){
            arr[i] = e;
            e--;
        }
        //Task5 task5 = new Task5();
        //arr = task5.gmomeSort(arr);
        //for(int i = 0; i < arr.length; i++) System.out.print(arr[i]+ " ");
        */
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
        matrix.printMatrix();
        System.out.println(matrix.getMaxValue());
        System.out.println(matrix.getMinValue());
        int[] d = matrix.getDiagonal();
        for(int i = 0; i < d.length; i++){
            System.out.println(d[i]);
        }
        Matrix new_matrix = (Matrix) Matrix.deepClone(matrix);
        new_matrix.printMatrix();

    }

}
