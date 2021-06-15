package com.company;
import java.util.Scanner;
public class Condition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Age ");
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("You are eligible to drive, Good Luck!");
        }
        else
        {
            System.out.println("You are not eligible to drive, You need to wait a little longer");
        }
    }
}
