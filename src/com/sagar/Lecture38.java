package com.sagar;

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

        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList.isEmpty());
        for(int i=0;i<4;i++){
            System.out.println(myLinkedList.get(i));
        }

    }

    static class MyLinkedList{
        /*Task 38:
        1. Make this class Generics
        2. Create an add/remove method that takes 2 params(index,element)
         */
        Node first;
        Node last;
        void add(Integer val){
            Node newNode = new Node(val);
            if(last==null){
                first=newNode;
                last=newNode;
            }else{
                last.next=newNode;
                last = newNode;
            }
        }
        Integer get(int index){
            Node temp=first;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.val;
        }
        boolean isEmpty(){
            return first==null;
        }
    }

    static class Node{
        Integer val;
        Node next;
        Node(Integer val){
            this.val=val;
        }
    }

}
