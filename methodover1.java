package com.company;

public class methodover1 {
    static void fun()
    {
        System.out.println("Good Morning!");
    }
    static void fun(int a)
    {
        System.out.println("Good Morning! "+ a +" Kids");
    }
    static void fun(int a, int b)
    {
        System.out.println("Good Morning "+ a );
        System.out.println("Good Morning "+ b +" Teachers");

    }

    public static void main(String[] args) {
        //Method Overloading
        //Arguments are actual
        fun();
        fun(3000);
        fun(2200,4000);
    }


}
