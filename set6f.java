package com.company;
import java.util.Scanner;
public class set6f {
static double temp(int n)
{
    double x;
    if(n==0)
    {
        return 32;
    }
    else
    {
        x= 1.8*n + 32;
    }
    return x ;
}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature in celsius ");
        int a = sc.nextInt();
        double f = temp(a);
        System.out.println("The Temperature in Fahrenheit is : " + f);
    }


}
