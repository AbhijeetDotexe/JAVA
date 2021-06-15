package com.company;
import java.util.Scanner;
public class factorial1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial of ");
        int n = s.nextInt();
        double fact = 1.0d;
        for(int i=n;i>=1;i--)
        {
            fact = fact*i;
        }
        System.out.println("The factorial of the given number is "+ fact);
    }
}
