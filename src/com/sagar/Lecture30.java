package com.sagar;

public class Lecture30 {
    public static void main(String[] args) {
        //Compiler time polymorphism - overloading
        //Runtime polymorphism - overriding
        Dog dog=new Dog();
        dog.eat(0);
    }
    static class Animal{
        void eat(int name){
            System.out.println("Animal is Eating..");
        }
    }
    static class Dog extends Animal{
        int name;
        @Override
        void eat(int name){
            this.name = name;
            System.out.println("Dog is eating..");
        }
    }
}

