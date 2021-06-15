package com.company;
import java.util.*;
public class ArrayDequeue1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.add(6);
        d.add(7);
        d.addFirst(1);
        d.addLast(8);
        d.addLast(9);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
    }
}
