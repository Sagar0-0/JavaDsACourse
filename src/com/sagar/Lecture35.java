package com.sagar;

import java.util.Scanner;

public class Lecture35 {
    public static void main(String[] args) {
        //exception - unexpected problem
        //exception handling
        //try{}
        //catch{}
        //finally
        //throw
        //throws

        int[]arr=new int[2];
        arr[0]=100;
        arr[1]=100;
        int a;
        try{
            Scanner sc=new Scanner(System.in);
            int x=1;
            int index=sc.nextInt();
            fxn();
            int z = x/index;
            System.out.println(z);
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Any exception finally occurred");
        }

        System.out.println("Important things");
    }
    static void fxn() throws ArithmeticException{
        throw new ArithmeticException("");
    }
}
