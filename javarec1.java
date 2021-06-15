package com.company;
import java.util.Scanner;
public class javarec1 {
    static float factorial(float n) {
        float s;
        if (n == 0 || n == 1) {
            return 1;
        } else {
             s = n * factorial(n - 1);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial of ");
        float n =sc.nextFloat();
        float e= factorial(n);
        System.out.println("The factorial of the given number is = "+e );
    }
}
