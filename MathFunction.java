package com.company.hw01;

public class MathFunction {

    public double getPow(float x, double pow) {

        double result = x;
        for (int i = 1; i < Math.abs(pow); i++) {
            result *= x;
        }
        if (pow > 0) {
            return result;
        } else if (pow < 0) {
            return 1 / result;
        }
        return 1;
    }
}
