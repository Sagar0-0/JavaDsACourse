package com.sagar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lecture37 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(100);
        arrayList.add(1);
        arrayList.add(2);

        Pair<String,Pair<String,String>> pair;
    }
    static class Pair<F,S>{
        F first;
        S second;
        Pair(F first,S second){
            this.first=first;
            this.second=second;
            if(first instanceof Integer){
                System.out.println("Yes we got Integer");
            }
        }
        @Override
        public String toString(){
            return first.toString() + " " + second.toString();
        }
    }
}
