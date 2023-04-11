package com.sagar;

import com.sagar.myCollection.MyLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lecture38 {
    public static void main(String[] args) {
//        List<Integer> al=new ArrayList<>();
//        long beforeal=System.currentTimeMillis();
//        for(int i=0;i<100000;i++){
//            al.add(0,i);
//        }
//        long afteral=System.currentTimeMillis();
//        System.out.println(afteral-beforeal);
//
//        List<Integer> ll =new LinkedList<>();
//        long beforell=System.currentTimeMillis();
//        for(int i=0;i<100000;i++){
//            ll.add(0,i);
//        }
//        long afterll=System.currentTimeMillis();
//        System.out.println(afterll-beforell);

        List<Integer> ll =new LinkedList<>();
//        ll.add(0);
//        ll.add(1);
//        ll.add();

        MyLinkedList<String> myLinkedList=new MyLinkedList<>();
        myLinkedList.add("1");
        myLinkedList.add("2");
        myLinkedList.add("3");
        myLinkedList.add("4");
        System.out.println(myLinkedList.isEmpty());
        for(int i=0;i<4;i++){
            System.out.println(myLinkedList.get(i));
        }

    }





}
