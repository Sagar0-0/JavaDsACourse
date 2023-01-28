package com.sagar;

public class Lecture27 {
    public static void main(String[] args) {
        Printer p=new Printer(1,0);
        System.out.println(p.valueOfInk);
    }
    static class Printer{
        // return name(){}
        int valueOfInk;
        Printer(){

        }
        Printer(int value){
            this.valueOfInk=value;
        }
        Printer(int value,int sum){
            this.valueOfInk=value;
        }
        Printer(Printer p){
            this.valueOfInk = p.valueOfInk;
        }
    }
}
