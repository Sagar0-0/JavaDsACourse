package com.sagar.myCollection;

public class MyLinkedList<T> {
    /*Task 38:
    1. Make this class Generics
    2. Create an add/remove method that takes 2 params(index,element)
     */
    Node<T> first;
    Node<T> last;
    int size;

    public boolean add(int index, T val) {

        //temp.next
        //temp.next.next
        //temp.next=temp.next.next;

        if (index > size) return false;
        Node<T> newNode = new Node<>(val);
        if (index == 0) {
            Node<T> furtherLL = first;
            first = newNode;
            newNode.next = furtherLL;
            return true;
        }
        Node<T> temp = first;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node<T> furtherLL = temp.next;
        temp.next = newNode;
        newNode.next = furtherLL;
        return true;
    }

    public void add(T val) {
        Node<T> newNode = new Node<>(val);
        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    public T get(int index) {
        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}