package com.sjsu.sanaz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator();
        System.out.println("result " + bc.calculate("222*3+5/6*3+15"));



      //  StringToInteger si = new StringToInteger();
      //  System.out.println(si.myAtoi(" "));

      //  ReverseBits rv = new ReverseBits();

      //  rv.reverseBits(567);

      //  MasterMind m = new MasterMind();
      //  m.masterMind("1122", "0001");


      //  EnglishInt ei = new EnglishInt();
     //   System.out.print(ei.convert(1216));


     /*   SuffleAList suffleAList = new SuffleAList();
        int[] res = suffleAList.suffle(new int[]{1,2,3,4,5,6,7});

        for(int i : res){
            System.out.print(i +" ");
        } */

    /* BinaryToDecimal bd = new BinaryToDecimal();
     System.out.println(bd.binaryToDecimal("101010"));

     System.out.println(bd.decimalToBinary(10));
        System.out.println(bd.decimalToBinary(61)); */

   /* Insertion in = new Insertion();
    System.out.print(in.insertion(1000000000, 11011, 2, 7)); */

        /* NumberSwapper ns = new NumberSwapper();
        ns.numberSwapper(4, 5); */

      /* WordFrequencies wf = new WordFrequencies();
       String[] book = {"Hi", " my", " Name", "is", "sanaz", "Sanaz", "is", "a", ",good", "girl.", "Sanaz"};
       System.out.println(wf.wordFrequencies(book, "sanaz"));

       System.out.println(wf.wordHowManyTimes("Sanaz",book)); */


     /* Operations op = new Operations();
        System.out.println(op.multiply(10, 7));

        System.out.println(op.subtraction(10, 10));

        System.out.println(op.division(66, 6)); */

    /* ContiguousSequence cs = new ContiguousSequence();
     System.out.print(cs.contiguousSequence(new int[]{1, 4, 5, -10, 6,-3 ,17,})); */

  /*  AddOne ad = new AddOne();

    int[] number = new int[]{9,9,9,9,4};

    int[] res = new int[5];

    res = ad.addOne(number);

    for(int i = 0; i < res.length; i++){
        System.out.print(res[i]);
    }

    } */

     /*   TwoSum ts = new TwoSum();
        int[] res = ts.twoSumVersion1(new int[]{1, 3, 4, 4, 5, 9}, 10);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        } */

    /* RunnableThreadExample rte = new RunnableThreadExample();
     Thread t = new Thread(rte);
     t.start();


        while (rte.counter != 5){
            try {
                Thread.sleep(250);
            }catch (InterruptedException exc){
                exc.printStackTrace();
            }
        } */

  /*  SumSwap sw = new SumSwap();
    int[] res = new int[2];
    res = sw.sumSwapV(new int[]{1,4, 2, 1, 1, 2}, new int[]{3,6,3,3});
    for(int i = 0; i < res.length; i++){
        System.out.print(res[i] + " ");
    } */

        // Pair With Sum Question
      /*  ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        PairWithSum pws = new PairWithSum();
        res = pws.pairWithTwoSum(new int[]{1,9,6,3,4,2}, 7);
        System.out.print(res.size()); */

     /* FactorialZeros fz = new FactorialZeros();
      System.out.print(fz.factorialZeros(25)); */

    /* MaxProductSubArray m = new MaxProductSubArray();
     int[] array = new int[]{5,6,0,-1,4,-6,7};

     System.out.print(m.maxProduct(array));*/

  /*  TicaTacToe ttt = new TicaTacToe();
    System.out.print(ttt.convertBoardToInt(new TicaTacToe.Piece[][]{{TicaTacToe.Piece.blue, TicaTacToe.Piece.empty,TicaTacToe.Piece.blue}, {TicaTacToe.Piece.empty, TicaTacToe.Piece.red,TicaTacToe.Piece.blue}
    ,{TicaTacToe.Piece.blue, TicaTacToe.Piece.red,TicaTacToe.Piece.blue}}));
    */
 // WordPattern wp = new WordPattern();
//  System.out.print(wp.wordPattern("abba", "dog dog dog dog"));

 // ThreeSum ts = new ThreeSum();
 // List<List<Integer>> res = new ArrayList<List<Integer>>();
 // res = ts.threeSum(new int[]{-1, 0, 1, 2, -3, -4});

 // res = ts.threeSum(new int[]{-1, 0, 1, 2, -1, -4, 6, 4, 3}, 3);

  //for(int i = 0; i < res.size(); i++){
  //    System.out.print(res.get(i) + " ");
 // }


    }
}
