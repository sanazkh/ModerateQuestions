package com.sjsu.sanaz;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by sanazk on 9/16/18.
 */
public class PairWithSum {

    ArrayList<ArrayList<Integer>> pairWithTwoSum(int[] nums, int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> res;
        HashSet<Integer> numbers = new HashSet<>();

        for(int i : nums){
            numbers.add(i);
        }

        for(int j : nums){
            int lookingForNumber = target - j;
            if(numbers.contains(lookingForNumber)){
                res = new ArrayList<>();
                res.add(j);
                res.add(lookingForNumber);
                result.add(res);
                numbers.remove(j);
            }
        }
        return result;
    }
}
