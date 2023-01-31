package com.sagar;

public class Lecture29 {
    public static void main(String[] args) {
        //Single level
        // Multilevel
        // Hierarchical
        // Hybrid
        //Multiple Inheritance (Not supported) (Diamond problem)

        Dog myDog=new Dog();
        myDog.birthDate =0;
        myDog.deathDate=1;
        myDog.live();

//        Plant plants=new Plant();
//        plants.
    }
}

class LivingBeing{
    int birthDate;
    int deathDate;
    void live(){
        System.out.println("Living...");
    }
}

class Plant extends LivingBeing{
    void eating(){
        System.out.println("Taking sunlight..");
    }
}

class Animal extends LivingBeing{
//    @Override
//    void live(){
//        System.out.println("Animal is living...");
//    }
    void eating(){
        System.out.println("Animal is Eating...");
    }
}
class Dog extends Animal{
    @Override
    void eating(){
        super.eating();
        System.out.println("Dog is eating...");
    }
}

