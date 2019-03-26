package com.company.hw01;

public class Promise {
    public int resultOfMatch(int firstResult, int secondResult, int firstPromise, int secondPromise) {
        return (firstResult == firstPromise) && (secondResult == secondPromise) ? 2 :
                (firstResult > secondResult && firstPromise > secondPromise)
                        || (firstResult <= secondResult && firstPromise <= secondPromise) ? 1 : 0;
    }
}
