package com.company;
import java.util.Scanner;
public class set5b {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of N ");
        int n = s.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.println(2*i);
            sum = sum + (2*i);

        }
        System.out.println("The Sum of first N even number is "+sum);
    }
}
