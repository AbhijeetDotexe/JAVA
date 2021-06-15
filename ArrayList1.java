package com.company;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(0,4);
        l1.add(1,16);
        l1.add(2,20);
        l1.add(3,9);
        l1.add(4,22);
        l2.add(22);
        l2.add(23);
        l2.add(24);
        l2.add(25);
        l2.add(26);
        l2.add(27);
        l1.addAll(l2);
        System.out.println(l1);
//        for(int i = 0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(22));
    }
}
