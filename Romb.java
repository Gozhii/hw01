package com.company.hw01;

public class Romb {

    public void printRomb(int size) {
        int escapes, stars;
        for (int i = 0; i < size; i++) {
            escapes = size - (i + 1);
            printSpaces(escapes);
            stars = size - escapes;
            printStars(stars);
            System.out.println();
        }

        //Work with 10 stars
        for (int i = size - 1; i >= 0; i--) {
            escapes = size - i;
            printSpaces(escapes);
            stars = size - escapes;
            printStars(stars);
            System.out.println();
        }
    }

    private void printSpaces(int escapes){
        for (int e = 0; e < escapes; e++) {
            System.out.print(" ");
        }
    }

    private void printStars(int stars){
        for(int e = 0; e < stars; e++){
            System.out.print("* ");
        }
    }

}
