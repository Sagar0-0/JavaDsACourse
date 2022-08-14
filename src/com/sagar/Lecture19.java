package com.sagar;

import java.util.Scanner;

public class Lecture19 {
    public static void main(String[] args) {
//        int[]arr=new int[]{1,2,3,4,5};
//        int[][]matrix=new int[][]{
//                {1,2},
//                {2,3},
//                {4,6}
//        };

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] a=new int[rows][cols];

        System.out.println("Enter "+ rows*cols +" values for a");
        for(int row=0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                a[row][col]=sc.nextInt();
            }
        }

//        int[][]b=new int[n][cols];
//        System.out.println("Enter "+ n*n +" values for b");
//        for(int row=0;row<b.length;row++){
//            for(int col=0;col<b[row].length;col++){
//                b[row][col]=sc.nextInt();
//            }
//        }


        //q1 convert 1d array into 2d array

//        System.out.println("Enter array size:");
//        int n=sc.nextInt();
//        int[]arr=new int[n];
//        System.out.println("Enter "+ n + " values:");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        //    i
//        //1 2 3 4 5 6 7 8 9 -arr
//        // 1 2 3
//        // 0 0 0
//        // 0 0 0
//        int rootN=(int)Math.sqrt(n);
//        int[][]mat=new int[rootN][rootN];
//
//        int ind=0;
//
//        for(int i=0;i<rootN;i++){
//            for(int j=0;j<rootN;j++){
//                mat[i][j]=arr[ind];
//                ind++;
//            }
//        }
//
//        System.out.println("Matrix:");
//        for(int[]ar:mat){
//            for(int i:ar){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        //q2 - transpose a matrix
//        int[][]transpose=new int[cols][rows];
//
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                transpose[j][i]=mat[i][j];
//            }
//        }
//
//        System.out.println("Transpose:");
//        for(int[] ar:transpose){
//            for(int i:ar){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        //q3 - matrix multiplication
//        int[][]ans=new int[rows][cols];
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                for(int k=0;k<n;k++){
//                    ans[i][j]+=a[i][k]*b[k][j];
//                }
//            }
//        }
//
//        System.out.println("Result matrix:");
//        for(int[]ar:ans){
//            for(int i:ar){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        System.out.println("Enter k");
//        int k=sc.nextInt();
//        int ans=0;
//
//        //iterating over given matrix
//        for(int x=0;x<=rows-k;x++){
//            for(int y=0;y<=cols-k;y++){
//
//                //iterating over k.k matrix
//                int curr=0;
//                for(int i=x;i<x+k;i++) {
//                    for (int j = y; j < y+k; j++) {
//                        curr += a[i][j];
//                    }
//                }
//
//                ans=Math.max(ans,curr);
//            }
//        }
//        System.out.println(ans);

    }
}
/*
Task 19:
    1. Given a binary matrix
    2. Given a k
    3. Find the maximum sum sub-matrix of size k.

    n=4
    k=2
1 0 1 0
1 0 1 1
1 1 0 1
0 0 0 0

3

 */
