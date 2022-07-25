package com.sagar;

import java.util.Scanner;

public class Lecture17 {
    public static void main(String[] args) {
//        size
//        value (1-size)
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter values:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //q1
        // 0 2 9
        //9
        //get min/max value from array
//        int min=Integer.MAX_VALUE;// 2^31 - 1
//        int max=Integer.MIN_VALUE;//-2^31
//        for(int currEle:arr){
//            if(currEle<min){
//                min=currEle;
//            }
//
//            if(currEle>max){
//                max=currEle;
//            }
//        }
//        System.out.println("Maximum value is: "+ max);
//        System.out.println("Minimum value is: "+ min);

        //q2 get avg from array
//        double sum=0;
//        for(int ele:arr){
//            sum+=ele;
//        }
//        double avg=sum/size;
//        System.out.println("Average from array: "+avg);

        //q3 - find index of element
        // 2 3 4
        // 3
//        System.out.println("Enter the target:");
//        int target=sc.nextInt();
//        int ans=-1;
//
//        for(int i=0;i<size;i++){
//            if(arr[i]==target){
//                ans=i;
//                break;
//            }
//        }
//
//        if(ans==-1){
//            System.out.println("Not present in the array");
//        }else{
//            System.out.println("Index is: "+ans);
//        }

        //q4 - count smaller elements on left

        //1. given target - 4

        // 9 4 3 10 0
        //index+1  -  size-1
        //if(ele<target)count++;

//        System.out.println("Enter target: ");
//        int target=sc.nextInt();
//        int index=0;
//        for(int i=0;i<size;i++){
//            if(arr[i]==target){
//                index=i;
//                break;
//            }
//        }
//        int count=0;
//        for(int i=index+1;i<size;i++){
//            if(arr[i]<target){
//                count++;
//            }
//        }
//        System.out.println("Smaller values: "+count);


//        2. count smaller values on left
        //9 4 3 10 0
        //i -> i+1 to size-1

//        for(int i=0;i<size;i++){
//            int target=arr[i];
//
//            //count smaller on left for target
//            int count=0;
//            for(int j=i+1;j<size;j++){
//                if(arr[j]<target){
//                    count++;
//                }
//            }
//            System.out.println("For "+ target +" smaller values count are "+  count);
//        }
    }
}
/*
Task 17:
    1. Take array input and print all the greater elements on right of every element
 */
