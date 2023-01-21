package com.sagar;

import java.util.*;

public class Task22 {
    public static void main(String[] args) {
        //1. Input sb string
        //2. Reverse and print it
        // "abc"
        // "cba"
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder rev= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        System.out.println(rev);

        //if have multiple "words" with same value then use String
        //if have to append multiple words then use StringBuilder
    }
}

