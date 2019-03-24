package com.company.hw01;

public class MathFunction {

    public double getPow(float x, double pow){
        double result = x;
        if(pow > 0){
            for(int i = 1; i < pow; i ++){
                result*=x;
            }
            return result;
        }else if(pow < 0){
            for(int i = 1; i < -pow; i ++){
                result*=x;
            }
            return 1/result;
        }
        return 1;
    }
}
