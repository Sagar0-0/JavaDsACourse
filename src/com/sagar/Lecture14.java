package com.sagar;

import java.util.Scanner;

public class Lecture14 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        //q1
//        for(int row=1;row<=n;row++) {
//            for (int star = 1; star <= n; star++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //q2
//        for(int row=1;row<=n;row++){
//            for(int star=1;star<=row;star++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //q3
//        for(int row=1;row<=n;row++){
//            for(int star=1;star<=n-row+1;star++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //q4
//        for(int row=1;row<=n;row++){
//
//            for(int spaces=1;spaces<=row-1;spaces++){
//                System.out.print("  ");
//            }
//
//            for(int star=1;star<=n-row+1;star++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



    }
}
/*
Task 14:
    1. Take integer input and print Pattern 5

         *
       * *
     * * *
   * * * *

Solution:

        for(int row=1;row<=n;row++){
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print(" ");
            }

            for(int star=1;star<=row;star++){
                System.out.print("*");
            }

            System.out.println();
        }
 */
