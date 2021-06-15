package com.company;
import java.util.Scanner;
public class set6c {
    static int sum(int n)
    {
        int s = 0;
       if(n==1)
       {
           s =1;
       }
       else
       {
           s  = n + sum(n-1);
       }
       return s;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int x = sc.nextInt();
        System.out.println("The sum of first " +x+" Natural Numbers is = "+ sum(x) );

    }
}
