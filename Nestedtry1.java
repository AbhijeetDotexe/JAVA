package com.company;
import java.util.Scanner;
public class Nestedtry1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 20;
        arr[1] = 30;
        arr[2] = 40;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the number of the index u want to find the value of ");
            int a = sc.nextInt();
            try {
                System.out.println("Welcome to nested Try Catch");
                try {
                    System.out.println(arr[a]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index out of bound exception ");
                }
            } catch (Exception e) {
                System.out.println("Catch exception for Try 1");
            }
        }
    }
}
