package com.sjsu.sanaz;

/**
 * Created by sanazk on 11/6/18.
 */
public class StringToInteger {

    public int myAtoi(String str){
        if(str.length() == 0 || str == null){
            return 0;
        }

        String newStr = str.replace(" ", "");
        boolean isNegative = false;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        if(newStr.equals("")){
            return 0;
        }
        else if(newStr.charAt(0) == '-'){
            isNegative = true;
            index = 1;
        }else if(newStr.charAt(0) == '+'){
            isNegative = false;
            index = 1;
        }

        double returnValue = 0;
        while (index < newStr.length() && Character.isDigit(newStr.charAt(index))){
            returnValue = returnValue * 10 + (newStr.charAt(index) - '0');
            index++;

        }

        if(isNegative){
            returnValue = 0 - returnValue;
            if(returnValue <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }else{
                return (int) returnValue;
            }
        }else{
            if(returnValue >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else{
                return (int) returnValue;
            }
        }

    }
}


