package com.sagar;

public class Lecture26 {
    public static void main(String[] args) {
        Printer p=new Printer();
        int sum=0;
        for(int i=0;i<10;i++){
            sum+= (p.scanAndPrint(i));
        }
        //1. Block scope

//        {
//            int a=0;
//            System.out.println(p);
//        }

//        System.out.println(a);
        //2. Method scope
        //3. Class scope
    }
}

class Printer{


    /* returnType functionName(){
    *  //body
    * return
    * }
    */

//    int scanAndPrint(){
//        int number=0;
//        System.out.println("Scanning and printing = "+ number);
//        return number;
//    }
    int scanAndPrint(int number){
        color=0;
        number++;
        System.out.println("Scanning and printing = "+ number);
        return number;
    }
    int scanAndPrint(long number){
        color=0;
        number++;
        System.out.println("Scanning and printing = "+ number);
        return (int)number;
    }
//    void scanAndPrint(int num1){
//        num1++;
//        System.out.println("Scanning and printing = "+ num1);
////        return num1;
//    }
    int color;
}

// Method/Function
// Argument/Parameter
// Function overloading
// Pass value
// Scopes
