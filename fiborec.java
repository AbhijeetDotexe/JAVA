package com.company;
import java.util.Scanner;
public class fiborec {
static int fib(int n)
{
    if(n==1||n==2)
    {
        return n-1;
    }
    else
    {
        return fib(n-1)+fib(n-2);
    }
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int res = fib(n);
        System.out.println("The value at "+n+" position in the fibonacci series is "+ res);
    }

}
