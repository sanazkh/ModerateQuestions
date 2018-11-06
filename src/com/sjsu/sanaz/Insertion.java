package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/18/18.
 */
public class Insertion {
    int insertion(int n, int m, int i, int j){
        char[] nNumber = String.valueOf(n).toCharArray();
        char[] mNumber = String.valueOf(m).toCharArray();

        int start = nNumber.length - j;
        int end = nNumber.length - i;

        int a = 0;
        int b = start;


        while (a < mNumber.length && b <= end){
            nNumber[b] = mNumber[a];
            a++;
            b++;
        }

        int result = Integer.parseInt(new String(nNumber));
        return result;
    }

    // Using bit manipulation

    int updateBit(int number, int i, boolean isBit1){
        int value = isBit1 ? 1 : 0;
        int mask = ~(1<<i);
        return (mask & number) | (value << i);

    }

  /*  int insertNumber(int n, int m, int i, int j){
        int result = n;

        result = updateBit()
    } */
}
