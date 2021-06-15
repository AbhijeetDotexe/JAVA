package com.company;
import java.util.Scanner;

public class cgpa {
    public static void main(String[] args)
    {
        float cg,a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your marks in Subject 1");
        a = s.nextFloat();
        System.out.println("Enter Your marks in Subject 2");
        b = s.nextFloat();
        System.out.println("Enter Your marks in Subject 3");
        c = s.nextFloat();
        cg = (a+b+c)/30;
        System.out.println("Your cgpa is ");
        System.out.println(cg);
    }
}
