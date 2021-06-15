package com.company;
import java.util.*;
public class Hashing1 {
    public static void main(String[] args) {
        HashSet<Integer> myHashset = new HashSet<>(6,0.5f);
        myHashset.add(2);
        myHashset.add(3);
        myHashset.add(4);
        myHashset.add(5);
        myHashset.add(6);
        myHashset.add(7);
        System.out.println(myHashset.size());
        System.out.println(myHashset);
        System.out.println(myHashset.contains(4));
    }
}
