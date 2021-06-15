package com.company;
import java.util.Scanner;

public class logical1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if(a && b)
        {
            System.out.println("y");
        }
        else {
            System.out.println("N");
        }
        System.out.println(!a);
        System.out.println(!b);
    }
}
