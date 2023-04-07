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

    static class MyLinkedList<T>{
        /*Task 38:
        1. Make this class Generics
        2. Create an add/remove method that takes 2 params(index,element)
         */
        Node<T> first;
        Node<T> last;
        int size;
        boolean add(int index, T val){

            //temp.next
            //temp.next.next
            //temp.next=temp.next.next;

            if(index>size)return false;
            Node<T> newNode = new Node<>(val);
            if(index==0){
                Node<T> furtherLL = first;
                first=newNode;
                newNode.next = furtherLL;
                return true;
            }
            Node<T> temp = first;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node<T> furtherLL= temp.next;
            temp.next = newNode;
            newNode.next = furtherLL;
            return true;
        }
        void add(T val){
            Node<T> newNode = new Node<>(val);
            if(last==null){
                first=newNode;
            }else{
                last.next=newNode;
            }
            last=newNode;
            size++;
        }
        T get(int index){
            Node<T> temp=first;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.val;
        }
        boolean isEmpty(){
            return size==0;
        }
    }

    static class Node<T>{
        T val;
        Node<T> next;
        Node(T val){
            this.val=val;
        }
    }

}
