package com.sagar;

import java.util.Scanner;

public class Lecture15 {
    public static void main(String[] args) {
        //pattern 1
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();


//        int number=1;
//        int m=n;
//        for(int row=1;row<=(2*n)-1;row++){
//
//            if(row>=1 && row<=n){
//                for(int star=1;star<=row;star++){
//                    System.out.print(number+" ");
//                    number++;
//                }
//            }else if(row>=n+1 && row<=(2*n)-1){
//                for(int star=1;star<=m-1;star++){
//                    System.out.print(number+" ");
//                    number++;
//                }
//                m--;
//            }
//
//            System.out.println();
//        }

//        pattern 2

//        for(int row=1;row<=n;row++){
//
//            for(int space=1;space<=n-row;space++){
//                System.out.print(" ");
//            }
//
//            for(int star=1;star<=row;star++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

//        pattern 3

//        int number=1;
//
//        for(int row=1;row<=n;row++){
//
//            for(int space=1;space<=n-row;space++){
//                System.out.print(" ");
//            }
//
//            for(int star=1;star<=row;star++){
//                System.out.print(number + " ");
//                number++;
//            }
//
//            System.out.println();
//        }

        //pattern 4

//        int m=n;
//        for(int row=1;row<=(2*n)-1;row++){
//            if(row>=1 && row<=n){
//
//                for(int space=1;space<=n-row;space++){
//                    System.out.print(" ");
//                }
//                for(int star=1;star<=row;star++){
//                    System.out.print("* ");
//                }
//
//            }else{
//
//                for(int space=1;space<=row-n;space++){
//                    System.out.print(" ");
//                }
//                for(int star=1;star<=m-1;star++){
//                    System.out.print("* ");
//                }
//                m--;
//            }
//
//            System.out.println();
//        }

        //pattern5
//        for(int row=1;row<=n;row++){
//            if(row==1 || row==2 || row==n){
//                for(int star=1;star<=row;star++){
//                    System.out.print("* ");
//                }
//            }else{
//                System.out.print("* ");
//                for(int spaces=1;spaces<=row-2;spaces++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
    }
}
/*
Task 15:
    Print that pattern

    n=5
    * * * * *
     * * * *
      * * *
       * *
        *
       * *
      * * *
     * * * *
    * * * * *
 */
