package com.sjsu.sanaz;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sanazk on 9/18/18.
 */
public class SuffleAList {

    int[] suffle(int[] numbers){

        if(numbers.length == 0){
            return null;
        }

        Random rn = new Random();
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            int newIndex = i + rn.nextInt(n-i);
            int temp = numbers[i];
            numbers[i] = numbers[newIndex];
            numbers[newIndex] = temp;
        }

        return numbers;
    }
}
