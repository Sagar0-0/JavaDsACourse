package com.sagar;

public class Lecture30 {
    public static void main(String[] args) {
        //Compiler time polymorphism - overloading
        //Runtime polymorphism - overriding
        Dog dog=new Dog();
        dog.eat();
    }
    static class Animal{
        void eat(){
            System.out.println("Animal is Eating..");
        }
    }
    static class Dog extends Animal{
        @Override
        void eat(){
            System.out.println("Dog is eating..");
        }
    }
}

