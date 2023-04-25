package com.sagar;

import java.util.*;

public class Lecture40 {
    public static void main(String[] args) {
        /*
        1. Map
        2. Set
        3. hashcode & equals
         */

        /*
        sagar -> 1
        java -> 10
        dsa -> 100


        1 -> a
        2-> b
        3 -> c

        3-> z
         */
//        map.put("sagar",1);
//        map.put("java",1);
//        map.put("dsa",1);

//        String s = "sagar";
//        System.out.println(s.hashCode());

//        Pair pair1 = new Pair(1,"sagar");
//        Pair pair2 = new Pair(1,"sagar");
//        System.out.println(pair1);
//        System.out.println(pair2);
//        Map<Pair,Integer> map = new HashMap<>();
//        map.put(pair1,1);
//        map.put(pair2,2);
//        System.out.println(map);
//        System.out.println(pair1.equals(pair2));

        Set<Integer> set = new HashSet<>();

        set.add(6);
        set.add(5);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);
    }
    static class Pair{
        int num;
        String name;
        Pair(int a , String s){
            num = a;
            name = s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return num == pair.num && name.equals(pair.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(num, name);
        }
    }
}
