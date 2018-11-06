package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/26/18.
 */
public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int dpMax = nums[0];
        int dpMin = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            int k = dpMax * nums[i];
            int m = dpMin * nums[i];
            dpMax = Math.max(nums[i], Math.max(k, m));
            dpMin = Math.min(nums[i], Math.min(k, m));

            max = Math.max(dpMax, max);
        }
        return max;
    }
}
