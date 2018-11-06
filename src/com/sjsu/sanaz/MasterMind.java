package com.sjsu.sanaz;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by sanazk on 9/25/18.
 */
public class MasterMind {

    class Result{
        int hit = 0;
        int psudoHit = 0;
    }

  int[] masterMind(String solution, String guess){
        if(solution.length() != guess.length()){
            return new int[]{0,0};
        }
        HashMap<Character, Integer> map = new HashMap<>();

        int hit = 0;
        int pesudoHit = 0;

        for(int i = 0; i< solution.length(); i++){
            if(solution.charAt(i) == guess.charAt(i)){
                hit++;
            }else{
                map.put(guess.charAt(i), map.getOrDefault(guess.charAt(i), 0)+1);
            }
        }

        for(int i = 0; i < guess.length(); i++){
            if(guess.charAt(i) != solution.charAt(i) && map.containsKey(solution.charAt(i))){
                pesudoHit++;
                if(map.get(solution.charAt(i)) == 1){
                    map.remove(solution.charAt(i));
                }else if(map.get(solution.charAt(i)) > 1){
                    map.put(solution.charAt(i), map.getOrDefault(solution.charAt(i), 0)-1);
                }
            }
        }

        System.out.println("hit "+ hit + "pesudo hit " + pesudoHit);
        return new int[]{hit, pesudoHit};
  }

}
