package com.company;
import java.util.Scanner;
public class TakingINP2 {
    public static void main(String[] args)
    {
        System.out.println("Taking input from the user \n ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
         // int a = sc.nextInt();
        //  boolean b1 = sc.hasNextFloat();
        // System.out.println(b1);
        float a = sc.nextFloat();

        System.out.println("Enter number 2: ");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("\n\nThe sum of these numbers is : ");
        System.out.println(sum);
        //String str = sc.next();  Reads just one word
        String str = sc.nextLine(); // Reads complete line
        System.out.println(str);
    }

}
