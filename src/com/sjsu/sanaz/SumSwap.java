package com.sjsu.sanaz;

import java.util.HashSet;

/**
 * Created by sanazk on 9/16/18.
 */
public class SumSwap {

    // Brute force
    int[] sumSwap(int[] arrayA, int[] arrayB){
        int sumA = calculateSum(arrayA);
        int sumB = calculateSum(arrayB);

        if(Math.abs(sumA - sumB) % 2 != 0){
            throw  new IllegalArgumentException("No possible answer");
        }

        for(int i = 0; i < arrayA.length; i++){
            for(int j = 0; j < arrayB.length; j++){
                int newSumA = sumA - arrayA[i] + arrayB[j];
                int newSumB = sumB - arrayB[j] + arrayA[i];
                if(newSumA == newSumB){
                    return new int[]{arrayA[i], arrayB[j]};
                }
            }
        }
        throw  new IllegalArgumentException("No possible answer");
    }


    // Better solution
    int[] sumSwapV(int[] arrayA, int[] arrayB){
        HashSet<Integer> arrayBValues = new HashSet<>();

        for(int i : arrayB){
            arrayBValues.add(i);
        }
        int sumA = calculateSum(arrayA);
        int sumB = calculateSum(arrayB);
        int sum = (sumB - sumA) / 2;

        for(int i = 0; i < arrayA.length; i++){
            int target =  arrayA[i] + sum;
            if(arrayBValues.contains(target)){
                return new int[]{arrayA[i], target};
            }
        }
        throw  new IllegalArgumentException("No possible answer");
    }


    int calculateSum(int[] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }



}
