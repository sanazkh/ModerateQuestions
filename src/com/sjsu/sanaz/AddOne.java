package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/15/18.
 */
public class AddOne {

    int[] addOne(int[] number){

        int carry = 0;
        int lastNumber = 0;
        for(int i = number.length - 1; i >= 0; i--){
            int res = number[i] + 1;
            if(res >= 10){
                number[i] = res % 10;
                carry = res / 10;
                if(i == 0 && carry != 0) {
                    lastNumber = carry;
                }
            }else{
                number[i] = number[i] + 1;
                break;
            }
        }

        if(lastNumber == 0){
            return number;
        }else{
            int[] newNumber = new int[number.length + 1];
            newNumber[0] = lastNumber;
            for(int i = 1; i < newNumber.length; i++){
                newNumber[i] = number[i-1];
            }
            return newNumber;
        }
    }
}
