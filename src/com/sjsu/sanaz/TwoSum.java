package com.sjsu.sanaz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sanazk on 9/15/18.
 */
public class TwoSum {

    // If array is sorted

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int sum = nums[start] + nums[end];
            if(sum != target){
                if(sum > target){
                    end--;
                }else if(sum < target){
                    start++;
                }
            }else if(sum == target){
                result[0] = start;
                result[1] = end;
                return result;
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    // If array is not sorted

    public int[] twoSumVersion1(int[] nums, int target){
        HashMap<Integer, Integer> complement = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complemeRes = target - nums[i];
            if(complement.containsKey(complemeRes)){
                return new int[]{complement.get(complemeRes), i};
            }else{
                complement.put(nums[i], i);
            }
        }
        throw  new IllegalArgumentException("No two sum solution");
    }
}
