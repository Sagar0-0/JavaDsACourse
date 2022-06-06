package com.sagar;


import java.util.Scanner;

public class Lecture10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //factorial
//        int factorial=1;
//        int n=sc.nextInt();
//        for(int i=n;i>=1;i--){
//            factorial*=i;
//        }
//        System.out.println(factorial);

        //fibonacci series
        // 0 1 1 2 3 5 8.....
        /*int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n-2;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }*/

        //series sum
        // 1/1 + 1/2 + 1/3 + 1/4 + .... 1/n;

//        float sum=0;
//        int n=sc.nextInt();
//        for(float i=1;i<=n;i++){
//            sum+=1/i;
//        }
//        System.out.println(sum);


        //prime number
        // eg.2,3,5,7,11...
//        35 = 5*7
//        root(n) = i
//        n= i*i

//        int n=sc.nextInt();
//        if(n==1){
//            System.out.println("Not prime");
//        }else{
//            boolean prime=true;
//            for(int i=2;i*i<=n;i++){
//                if(n%i==0){
//                    prime=false;
//                    System.out.println("Not prime");
//                    break;
//                }
//            }
//            if(prime){
//                System.out.println("Prime");
//            }
//        }

    }
}
/*
Task 10:
    1. Take one integer input 'n'
    2. Using for loop print the sum of first 'n' number from the given series
    Series:
        1/1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + .....
 */
