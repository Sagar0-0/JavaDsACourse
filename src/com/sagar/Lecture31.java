package com.sagar;

public class Lecture31 {
    public static void main(String[] args) {
        //Abstract class -
        //Can not create INSTANCE of abstract class
        //Can create constructors[Used for children classes]
        //create final and static

        Shape shape=new Rectangle();
        shape.draw();
    }
}
abstract class Shape{
    Shape(){
        System.out.println("Shape cons..");
    }
    int ans=0;
    abstract void draw();
    void drawAgain(){
        System.out.println("Drawing again..");
    }
}
class Rectangle extends Shape{
    Rectangle(){
        System.out.println("Rectangle constructor called");
    }
    @Override
    void draw(){
        System.out.println("Rectangle is drawn..");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Circle is drawn..");
    }
}

