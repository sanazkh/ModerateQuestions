package com.sjsu.sanaz;

import java.util.HashMap;

/**
 * Created by sanazk on 10/5/18.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] splited = str.split("\\s+");
        HashMap<Character, String> tracker = new HashMap<>();

        if(splited.length != pattern.length()){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = splited[i];

            if(tracker.containsKey(c)){
                if(!tracker.get(c).equals(word)){
                  //  System.out.println(tracker.get(c));
                  //  System.out.println(word);
                    return false;
                }
            }else{
                if(tracker.containsValue(word)){
                    return false;
                }
                tracker.put(c, word);
            }
        }
        return true;
    }
}
