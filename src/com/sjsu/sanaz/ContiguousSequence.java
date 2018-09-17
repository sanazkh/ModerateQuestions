package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/15/18.
 */
public class ContiguousSequence {

    int contiguousSequence(int[] array){
        int maxSum = 0;
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
            if(sum > maxSum){
                maxSum = sum;
            }else if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
