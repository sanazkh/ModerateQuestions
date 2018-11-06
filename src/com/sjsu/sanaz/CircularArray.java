package com.sjsu.sanaz;

/**
 * Created by sanazk on 10/5/18.
 */
public class CircularArray {

    // A circular array with relative indices, check if it has a single complete cycle.

    boolean hasCycle(int[] nums){
        int numsLength = nums.length;
        int currentIndex = 0;

        if(numsLength == 0){
            return false;
        }
        if(numsLength == 1){
            return true;
        }

        for(int i = 0; i < numsLength; i++){
            currentIndex = (currentIndex + nums[currentIndex]) % numsLength;
            if(currentIndex < 0){
                currentIndex += numsLength;
            }
            if(currentIndex == 0 && i < numsLength - 1){
                return false;
            }
        }
        return currentIndex == 0;
    }
}
