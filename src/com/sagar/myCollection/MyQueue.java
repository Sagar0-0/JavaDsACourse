package com.sagar.myCollection;

public class MyQueue<T> {
    Node<T> first;
    Node<T> last;

    public void offer(T val) {
        Node<T> newNode = new Node<>(val);
        if(first==null){
            first = last = newNode;
            return;
        }
        last.next = newNode;
        last = newNode;
    }
    public T poll(){
        if(first==null)return null;
        T value = first.val;
        first = first.next;
        return value;
    }
}
