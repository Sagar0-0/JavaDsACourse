package com.sagar;

public class Lecture33 {
    static{

    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollNo=1;
        s1.clgName = "ABC";

        Student.reading();
        Student s2=new Student();
        s2.rollNo=2;
        System.out.println(s2.clgName);
    }
    static class Student{
        int rollNo;
        String name;
        static String clgName;
        static void reading(){
            System.out.println("reading..");
        }
    }
}


