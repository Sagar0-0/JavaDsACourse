package com.sagar;

import java.util.Scanner;

public class Lecture24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }//O(N)
        System.out.println(sum);

        int sumB=n*(n+1)/2;//O(1)
        System.out.println(sumB);

        int x=1;
        int []arr=new int[]{5,4,3,2,1};//O(N)
        for(int i=0;i<5;i++){
            if(arr[i]==x){
                System.out.println("FOUND");
                break;
            }
        }//O(N), (1)
    }
}
