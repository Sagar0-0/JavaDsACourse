package com.sagar;

import java.util.Scanner;

public class Lecture21 {
    public static void main(String[] args) {
        //linear search
        // 2 52 4 6 23 8 3
        //4
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size:");
//        int n=sc.nextInt();
//        int[]arr=new int[n];
//        System.out.println("Enter values:");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }

//        int[]arr=new int[]{1,2,3,4,5,6,7,8,9,0};
////        System.out.println("Enter the target:");
////        int target=sc.nextInt();
//        int target=3;
//        int ansIndex = -1;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                ansIndex=i;
//                break;
//            }
//        }


//        int[][]mat=new int[][]{
//                {1,2,3,4},
//                {0,6573,2},
//                {0,10,41,6,7,23,62,4,2,1}
//        };
//        int target=10;
//        boolean foundAns=false;
//        boolean shouldWeBreak=false;
//        for(int row=0;row<mat.length;row++){
//            int[] arr=mat[row];
//            for(int i=0;i<arr.length;i++){
//                if(arr[i]==target){
//                    System.out.println("ROW INDEX -> "+row);
//                    System.out.println("ELEMENT INDEX -> "+i);
//                    foundAns=true;
//                    shouldWeBreak=true;
//                    break;
//                }
//            }
//            if(shouldWeBreak)break;
//        }
//        if(!foundAns){
//            System.out.println("TARGET NOT FOUND");
//        }

        //binary search (divide and conquer )
        //ascending order
        //while(l<=h){
            //1. mid=(l+h)/2
            //2. if(target==arr[mid])found=true;print("INDEX IS: "+ mid)break;
            //   else if(target<arr[mid])h=mid-1
            // else if(target>arr[mid])l=mid+1
        //}
        //if(!found)print("INDEX NOT FOUND)

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[]arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        int target=sc.nextInt();
//        int l=0;
//        int h=arr.length-1;
//
//        //checking for order
//        boolean isASC=false;
//        if(arr[l]<arr[h])isASC=true;
//
//        int mid;
//        boolean foundAns=false;
//        while(l<=h){
//            mid=(l+h)/2;
//            if(target==arr[mid]){
//                foundAns=true;
//                System.out.println("INDEX IS: "+mid);
//                break;
//            }else if(target>arr[mid]){
//                if(isASC){
//                    l=mid+1;
//                }else{
//                    h=mid-1;
//                }
//            }else{
//                if(isASC){
//                    h=mid-1;
//                }else{
//                    l=mid+1;
//                }
//            }
//        }
//        if(!foundAns) System.out.println("NOT FOUND");
    }
}
/*
Task 21:
    1. Input a sorted array that have duplicate values
    2. Input a target that is present in the array
    3. Binary search in the array and return index of last occurrence of target

    // 1 2 2 2 3 3 4
    //2
    //index = 2
 */
