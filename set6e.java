package com.company;
import java.util.Scanner;
public class set6e {
    static void pattern_rec(int n)
    {
        if(n>0)
        {
            pattern_rec(n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = s.nextInt();
        pattern_rec(n);
    }

}
