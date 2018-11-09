package com.sjsu.sanaz;

import java.util.HashSet;

/**
 * Created by sanazk on 11/7/18.
 */
public class DivingBoard {

    // Some pairs are redundant. For example, if we choose 3 and 4 or 4 and 3.

    HashSet<Integer> getAllLengths(int k, int shorter, int longer){
        HashSet<Integer> lengths = new HashSet<>();
        HashSet<String> visited = new HashSet<>();
        getAllLengths(k, shorter, longer, lengths, visited, 0);
        return lengths;
    }

    void getAllLengths(int k, int shorter, int longer, HashSet<Integer> lengths, HashSet<String> visited, int total){
        if(k == 0){
            lengths.add(total);
            return;
        }
        String key = k + " " + total;
        if(visited.contains(key)){
            return;
        }
        getAllLengths(k - 1, shorter, longer, lengths, visited, total + shorter);
        getAllLengths(k - 1, shorter, longer, lengths, visited, total + longer);
        visited.add(key);
    }
}
