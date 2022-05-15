package com.sagar;

import java.util.Scanner;

public class Lecture7 {
    public static void main(String[] args) {

//        n=n>>1; //0101
//        if((n&1)==1){
//            System.out.println("set bit");
//        }else{
//            System.out.println("not set");
//        }
//        method -1
//        n=n>>(i-1)
//        n&1
//        method -2
//        n
//        mask= 1<<(i-1)
//        n&mask
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i=sc.nextInt();
//        int mask=1<<(i-1);
//        if((n&mask)>=1){
//            System.out.println("set bit");
//        }else{
//            System.out.println("not set");
//        }

//        set ith bit
//        int n=18; //10010
//        int i=1;
//        int mask=1<<(i-1);//00001
////        10010
////        00001
////        10011
////        n|mask
//        System.out.println(n|mask);

//        clear ith bit
//        int n=18;//10010
//        int i=2;
//        int mask=~(1<<(i-1));//11101
//
////        10010
////        11101
////        10000
//        System.out.println(n&mask);

//        counting set bits
//        10010
//        n&(n-1)
//        10010
//        10001
//        10000
//        n&(n-1)
//        10000
//        01111
//        00000
    }
}
/*
Task 7:
    1. Take 2 integer inputs a and b
    2. Find the difference of no. of bits in them.
    1011
    1101
   ^0110
 */
