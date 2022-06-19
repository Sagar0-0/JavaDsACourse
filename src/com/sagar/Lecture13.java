package com.sagar;

import java.util.Scanner;

public class Lecture13 {
    public static void main(String[] args) {
//        for(int i=1;i<=3;i++){
//
//            for(int j=1;j<=10;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        Scanner sc=new Scanner(System.in);
        int numberLimit=sc.nextInt();
        int tableUpto=sc.nextInt();
        for(int number=1;number<=numberLimit;number++){

            //print table of (number) from 1 - (tableUpto)
            for(int multiply=1;multiply<=tableUpto;multiply++){
                System.out.print(number*multiply + " ");
            }
            System.out.println();
        }

    }
}
/*
Task 13:
    1. Print first 'n' Prime numbers

Solution:

 */
