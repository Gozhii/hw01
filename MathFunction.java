package com.company.hw01;

public class MathFunction {

    public double getPow(float x, double pow) {
        double inner_pow = pow;
        double result = x;
        if (pow < 0) {
            inner_pow = -pow;
        }
        for (int i = 1; i < inner_pow; i++) {
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
