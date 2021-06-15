package com.company;

public class loop2 {
    public static void main(String[] args) {
        int i=1;
        int a = 4;
        do {
            System.out.println(a+" * "+i+" = "+ i*a);
            i++;
        }while (i<=100);
        System.out.println("Finished executing do while loop");
    }
}
