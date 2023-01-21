package com.sagar;

public class Lecture23 {
    public static void main(String[] args) {
//        String s1="sagar";
//        s1=s1.concat("abc");
//        System.out.println(s1);

//        StringBuffer bf=new StringBuffer();
//        System.out.println(bf.capacity());
//        for(int i=0;i<34;i++){
//            bf.append(i);
//        }
//        System.out.println(bf);
//        System.out.println(bf.capacity());

        StringBuilder sb1= new StringBuilder();
        sb1.append("bac");//97+96+98
        StringBuilder sb2=new StringBuilder();
        sb2.append("abc");//96+97+98
        System.out.println(sb1.length());
        //sb1==sb2 -> 0
        //sb1>sb2 -> 1
        //sb1<sb2 -> -1
    }
}
