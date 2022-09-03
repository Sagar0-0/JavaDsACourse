package com.sagar;


import java.util.Scanner;

public class Lecture20 {
    public static void main(String[] args) {
        //bubble sort - worst, adjacent
        //selection sort- select the min value of range and put on 1st
        //insertion sort- choose and insert on the right position

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //bubble sort algo
//        for(int iterationCount=0;iterationCount<n-1;iterationCount++){
//            // iteration
//            boolean notEntered=true;
//            for(int i=0;i<=n-2-iterationCount;i++){
//                //if wrong order then swap
//                if(arr[i]<arr[i+1]){
//                    notEntered=false;
//                    int temp=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
////            System.out.print(iterationCount+ " ");
//            if(notEntered){
//                break;
//            }
//        }
//        System.out.println();
//
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
        //O(n^2)

        //increasing order
        //O(n^2)
        //selection sort - select the max and put in the 1st position of our range

//        for(int i=0;i<n;i++){
//            int maxValue=Integer.MIN_VALUE;
//            int indexOfMax=0;
//            //iterating in the range
//            for(int j=i;j<=n-1;j++){
//                if(arr[j]>maxValue){
//                    maxValue=arr[j];
//                    indexOfMax=j;
//                }
//            }
//
//            int temp=arr[i];
//            arr[i]=maxValue;
//            arr[indexOfMax]=temp;
//
//        }
//
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
        //insertion sort

//        for(int i=0;i<n;i++) {
//            int temp = arr[i];
//            int j = i - 1;
//            for (; j >= 0; j--) {
//                if (arr[j] < temp) {
//                    arr[j + 1] = arr[j];
//                } else {
//                    break;
//                }
//            }
//            arr[j + 1] = temp;
//        }
//
//        for(int i:arr){
//            System.out.print(i+" ");
//        }

        //O(n^2)

    }
}
/*
Task 20:
    1. Given an array
    2. Sort it in decreasing order using all 3 algo
 */
