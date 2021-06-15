package com.company;

public class Errors2 {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The result is : "+c);
        }
        catch (Exception e)
        {
            System.out.println("Zero division Error, OOPS!");
            System.out.println(e);
        }
        System.out.println("End of the program ");

    }
}
