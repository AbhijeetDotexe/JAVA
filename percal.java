package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class percal {
    public static void main(String[] args)
    {
        float per,a,b,c,d,tot=0,avg;
        int ch;
        Scanner s = new Scanner(System.in);
        System.out.println("WELCOME TO CBSE PERCENTAGE CALCULATOR !");
        System.out.println("Enter Your marks in Subject 1 ");
        a = s.nextFloat();
        System.out.println("Enter Your marks in Subject 2 ");
        b = s.nextFloat();
        System.out.println("Enter Your marks in Subject 3 ");
        c = s.nextFloat();
        System.out.println("Enter Your marks in Subject 4 ");
        d = s.nextFloat();
        System.out.println("Enter Your marks in Subject 5 (If you don't have the 5 subject enter 0 ) ");
        float e = s.nextFloat();
        tot = a+b+c+d+e;
        System.out.println("Enter 1 if Your marks are out of 100 ");
        ch = s.nextInt();
        if(ch==1)
        {
            avg = tot/5;
            System.out.println("Your percentage is : ");
            System.out.println(avg);
        }
        else
        {
            avg = tot/4;
            System.out.println("Your percentage is : ");
            System.out.println(avg);
        }



    }
}

