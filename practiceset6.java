package com.company;
import java.util.Scanner;
public class practiceset6 {
    static void mul(int n){
        for(int i = 1;i<=10;i++)
        {
            //System.out.println( n +" * "+ i +" = "+ n*i);
            System.out.printf("%d * %d = %d \n",n,i,n*i);
        }

    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to print the table of ");
//        int n = sc.nextInt();
//
        mul(9);
    }
}
