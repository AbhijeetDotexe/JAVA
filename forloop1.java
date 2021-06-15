package com.company;
import java.util.Scanner;
public class forloop1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = s.nextInt();
        for(int i=1;i<=n;i+=2)
        {
            System.out.println(i); // For odd numbers
        }
    }
}
