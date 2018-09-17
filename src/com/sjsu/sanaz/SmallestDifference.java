package com.sjsu.sanaz;

import java.util.Arrays;

/**
 * Created by sanazk on 9/15/18.
 */
public class SmallestDifference {

    int smallestDifference(int[] arrayA, int[] arrayB){
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        int a = 0;
        int b = 0;
        int min = Integer.MAX_VALUE;
        while (a < arrayA.length && b < arrayB.length){
            int temp = Math.abs(a - b);
            if(temp < min){
                min = temp;
            }
            if(arrayA[a] < arrayB[b]){
                a++;
            }else{
                b++;
            }
        }
        return min;
    }
}
