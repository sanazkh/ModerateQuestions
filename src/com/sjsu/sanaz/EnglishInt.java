package com.sjsu.sanaz;

import java.util.LinkedList;

/**
 * Created by sanazk on 10/16/18.
 */
public class EnglishInt {

    String[] smalls = {"Zero","One", "Two", "Three", "Four", "Five","Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
    "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] bigs ={"", "Thousand", "Million", "Billion"};
    String hundred = "Hundred";
    String negative = "Negative";

    String convert(int number){
        if(number == 0){
            return smalls[0];
        }else if(number < 0){
            return negative + " " + convert(-1 * number);
        }

        LinkedList<String> parts = new LinkedList<>();
        int chunkCount = 0;
        while (number > 0){
            if(number % 1000 != 0){
                String chunk = convetChunk(number % 1000) + " " + bigs[chunkCount];
                parts.add(chunk);
            }else{
                number /= 1000; //Shift chunk
                chunkCount++;
            }
        }
        return listToString(parts);
    }

    String convetChunk(int number){
        LinkedList<String> parts = new LinkedList<>();
        // convert hundred place
        if(number >= 100){
            parts.addLast(smalls[number/100]);
            parts.addLast(hundred);
            number %= 100;
        }

        // convert ten place
        if(number >= 10 && number <= 19){
            parts.addLast(smalls[number]);
        }else if(number >= 20){
            parts.addLast(tens[number / 10]);
            number %= 10;
        }

        // Convert ones place
        if(number >= 1 && number <= 9){
            parts.addLast(smalls[number]);
        }
        return listToString(parts);
    }

    String listToString(LinkedList<String> input){
        StringBuilder sb = new StringBuilder();
        while (input.size() > 1){
            sb.append(input.pop());
            sb.append(" ");
        }
        sb.append(input.pop());
        return sb.toString();
    }
}
