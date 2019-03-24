package com.company.hw01;


public class Sort{

    public int[] bubleSort(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int e = 0; e < (i - 1); e++) {
                if (arr[e] > arr[e + 1]) {
                    swap(e,e+1);
                }
            }
        }
        return arr;
    }

    private void swap(int i, int e) {
        //Using another variable has additional memory
        e+=i;
        i = e - i;
        e-=i;
    }

    public int[] sheikerSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr[i],arr[i+1]);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr[i], arr[i-1]);
                }
            }
            left++;
        } while (left < right);
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int e = i; e < arr.length; e++) {
                if (arr[e] < arr[index]) {
                    index = e;
                }
            }
            int buff;
            buff = arr[index];
            arr[index] = arr[i];
            arr[i] = buff;
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int e = i;
            while (e > 0 && (arr[e] < arr[e - 1])) {
                swap(arr[e],arr[e-1]);
                e--;
            }
        }
        return arr;
    }

    public int[] gmomeSort(int a[]){
        int pos;
        for(int i = 0; i < a.length; i++){
            pos = i;
            while(pos > 0 && a[pos-1] > a[pos]){
                swap(a[pos-1],a[pos]);
                pos = pos - 1;
            }
        }
        return a;
    }

}
