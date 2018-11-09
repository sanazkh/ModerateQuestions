package com.sjsu.sanaz;

/**
 * Created by sanazk on 11/6/18.
 */
public class ReverseBits {

    int reverseBits(int num){
        int rev = 0;

        while (num > 0){
            rev <<= 1;

            if((int) (num & 1) == 1){
                rev ^= 1;
            }

            rev >>= 1;
        }

        return rev;
    }
}
