package com.company.hw01;

import java.util.Scanner;

public class Romb {

    public void printRomb(int size){
        int escapes, stars;
        for(int i = 0; i < size; i++){
             escapes = size-(i + 1);
            for(int e = 0; e < escapes; e++){
                System.out.print(" ");
            }
            stars = size - escapes;
            for(int e = 0; e < stars; e++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Work with 10 stars
        for(int i = size-1; i >= 0; i--){
            escapes = size-i;
            for(int e = 0; e < escapes; e++){
                System.out.print(" ");
            }
            stars = size - escapes;
            for(int e = 0; e < stars; e++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
