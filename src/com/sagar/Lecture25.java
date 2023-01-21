package com.sagar;

public class Lecture25 {
    public static void main(String[] args) {
        int a=1;
        Human firstHuman = new Human();
        firstHuman.name = "Sagar";
        System.out.println(firstHuman.name);
    }
}

class Human{
    String name;
    int age;
    int noOfFingers;
    String gender;
}