package com.sagar;

import java.util.Arrays;
import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        //1. Check whether a string is palindrome or not?
        // abc
        // racecar

        //2. Check whether two strings are Anagrams or not?
        // abcc a->1,  b->1, c->2 , d->0 , e-> 0, f->0
        // bcac a->1, b->1, c->2,
        //abcc
        //abcc
        // 1. same length
        // 2. same freq

//        Scanner sc=new Scanner(System.in);

        //1
//        String str=sc.next();
//////        StringBuilder rev=new StringBuilder(str);
//////        rev.reverse();
//////        System.out.println(str.equals(rev.toString()));
////
//        int i=0;
//        int j=str.length()-1;
//        boolean isPalindrome=true;
//        while(i<j){
//            if(str.charAt(i)==str.charAt(j)){
//                i++;
//                j--;
//            }else{
//                isPalindrome=false;
//                System.out.println("Not palindrome");
//                break;
//            }
//        }
//        //O(N)
//        if(isPalindrome){
//            System.out.println("Yes, Palindrome");
//        }

        //2
//        String a=sc.next();
//        String b=sc.next();
//        char[] first= a.toCharArray();
//        char[] sec= b.toCharArray();
//        Arrays.sort(first);// O(nlogn)
//        Arrays.sort(sec); // O(nlogn)
//        System.out.println(Arrays.equals(first,sec));

//        int[] arr=new int[128]; //O(1)
//        if(a.length()!=b.length()){
//            System.out.println("Not anagrams");
//            return;
//        }
//        // abca
//        // caba
//        for(int i=0;i<a.length();i++){
//            char ch1=a.charAt(i);
//            char ch2=b.charAt(i);
//            arr[ch1]++;
//            arr[ch2]--;
//        }//O(n)
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                System.out.println("Not anagrams");
//                return;
//            }
//        }
//        System.out.println("ANAGRAMS");
    }
}
