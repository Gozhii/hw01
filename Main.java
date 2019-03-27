package com.company;

import com.company.hw01.*;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

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


        MathFunction pow = new MathFunction();
        System.out.println(pow.getPow(3, 0));

        Matrix matrix1 = matrix.clone();

        if (matrix1 == matrix) {
            System.out.println("Both holds same object");
        }

        if (matrix.equals(matrix1)) {
            System.out.println("Both person1 and person2 have same country object");
        }

    }

}
