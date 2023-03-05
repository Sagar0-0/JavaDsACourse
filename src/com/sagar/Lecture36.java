package com.sagar;

import java.util.Arrays;

public class Lecture36 {
    public static void main(String[] args) {
        //Passed by value
        //Primitive - copy of value
        //String - copy of value
        //Arrays - location value of array
        //Objects - location value of objects
        int[]arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        fxn(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void fxn(int[] newArr){
        newArr[0]=100;
        newArr[1]=200;
        newArr[2]=400;
    }
    static class MyObj{
        int num;
        String str;
    }
}
