package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/18/18.
 */
public class BinaryToDecimal {


    int binaryToDecimal(String number){
        int result = 0;
        for(int i = 0; i < number.length(); i++){
            result += Character.getNumericValue(number.charAt(number.length()-i-1)) * Math.pow(2, i);
        }
        return result;
    }

    String decimalToBinary(int number){
        String result = "";
        StringBuilder sb = new StringBuilder();
        while (number > 0){
            int remainder = number % 2;
            sb.append(remainder);
            number = number / 2;
        }
        sb.reverse();
        result = sb.toString();

        return result;
    }
}
