package com.sagar.myCollection;

public class MyStack<T> {
    Node<T> head;
    int size;
    public void push(T val){
        size++;
        Node<T> newNode = new Node<>(val);
        newNode.next=head;
        head = newNode;
    }
    public T pop(){
        if(size==0){
            return null;
        }
        size--;

        T value = head.val;
        head = head.next;
        return value;
    }
    public T peek(){
        if(size==0){
            return null;
        }
        return head.val;
    }

    public boolean isEmpty(){
        return size==0;
    }
}
