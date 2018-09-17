package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/14/18.
 */
public class NumberSwapper {

    void numberSwapper(int x, int y){
        int a = x;
        int b = y;

         a = a+b;
         b = a - b;
         a = a- b;
         System.out.println(a);
         System.out.println(b);
    }
}
