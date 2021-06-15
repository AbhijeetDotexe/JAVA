package com.company;
import java.util.Scanner;
public class practiceset4 {
    public static void main(String[] args) {
        byte a,b,c,d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your marks in Maths ");
        a = s.nextByte();
        System.out.println("Enter Your marks in English ");
        b =s.nextByte();
        System.out.println("Enter you marks in Computer Science ");
        c = s.nextByte();
        System.out.println("Enter Your marks in Physics/Chemistry");
        d= s.nextByte();
        float avg = (a+b+c+d)/4.0f;
        if(avg>=40 && a>33 && b>33 && c>33 && d>33)
        {
            System.out.println("Your overall percentage is "+avg);
            System.out.println("Congratulations You have been promoted, Good Job!");

        }
        else
        {
            System.out.println("Your overall percentage is "+avg);
            System.out.println("OOPS, You have not been Promoted, Try again next Year");
        }
    }
}
