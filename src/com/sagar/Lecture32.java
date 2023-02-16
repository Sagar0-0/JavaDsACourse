package com.sagar;

public class Lecture32{
    /*
    Interface:
     By Default methods are public and abstract
     Can define a body of methods in interface
     Can define a private methods in interface
     Can define a static methods in interface
     Members are public, final, static
     */
    /*
    Abstract class vs Interface
    1. Type             Behaviour
    2. Generalising     Standardize
    3. Base class       Contract
     */
    public static void main(String[] args) {
        Football football=new Football();
        football.time = 160;
        football.play();
    }


}
interface Runnable{
    int a=0;
    default void Run(){

    }
}

abstract class Game{
    int time=0;
    void roundsPlayed(){
        System.out.println("0");
    }
    abstract void rules();
}
class Cricket extends Game implements Playable,Runnable{

    @Override
    public void Run() {
        Runnable.super.Run();
    }

    @Override
    void rules() {

    }

    @Override
    public void play() {

    }
}
class Football extends Game implements Playable{

    @Override
    void rules() {
        System.out.println("Play good..");
    }

    @Override
    public void play() {
        System.out.println("Playing football...");
    }
}
interface Playable{
    void play();
}
class Music implements Playable{

    @Override
    public void play() {

    }
}
