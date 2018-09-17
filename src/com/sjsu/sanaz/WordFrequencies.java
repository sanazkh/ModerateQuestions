package com.sjsu.sanaz;

import java.util.HashMap;

/**
 * Created by sanazk on 9/14/18.
 */
public class WordFrequencies {

    public int wordFrequencies(String[] book, String word){

        String myWord = word.trim().toLowerCase();
        int counter = 0;

        for(String w : book){
            if(w.trim().toLowerCase().equals(myWord)){
                counter++;
            }
        }
        return counter;
    }

    // Calling the algorithm multiple times

    HashMap<String, Integer> countEachWord(String[] book){
        HashMap<String, Integer> wordCounts = new HashMap<>();

        for(int i = 0; i < book.length; i++){
            if(wordCounts.containsKey(book[i])){
                wordCounts.put(book[i], wordCounts.get(book[i])+1);
            }else{
                wordCounts.put(book[i], 1);
            }
        }
        return wordCounts;
    }

    int wordHowManyTimes(String word, String[] book){

        HashMap<String, Integer> result = countEachWord(book);
        if(result.containsKey(word)){
            return result.get(word);
        }else{
            return -1;
        }
    }
}
