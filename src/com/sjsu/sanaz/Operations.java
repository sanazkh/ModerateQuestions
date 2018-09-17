package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/15/18.
 */
public class Operations {

    int multiply(int a, int b){

        int result = 0;
        if(a < b){
            result = calculateMuliplication(a, b);
        }else if (a > b){
            result = calculateMuliplication(b, a);
        }else{
            result = calculateMuliplication(a, b);
        }

      return result;
    }

    int calculateMuliplication(int loopLenght, int number){
        int result = 0;
        for(int i = 0; i < loopLenght; i++){
            result += number;
        }

        return result;
    }


    int subtraction(int a, int b){
        int result = 0;
        if(b + result == a){
            return result;
        }
        while (b + result != a){
            result++;
        }
        return result;
    }

    int division(int a, int b){
        int sum = b;
        int counter = 1;
        while (sum <= a){
            if(sum == a){
                break;
            }
            sum += b;
            counter++;

        }

        return counter;
    }
}
