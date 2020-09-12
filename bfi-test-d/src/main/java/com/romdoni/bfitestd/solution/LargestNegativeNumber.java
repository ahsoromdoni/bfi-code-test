package com.romdoni.bfitestd.solution;

public class LargestNegativeNumber {
    public int find(Integer[] a){
        int result=-1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (result==a[j]){
                    result--;
                }
            }
        }
        return result;
    }
}
