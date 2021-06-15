package com.company;

public class operator2 {
    static void change(int x)
    {
        x = 90;
    }
    static void change2(int[] arr)
    {
        arr[0] = 99;
    }
    static void joke()
    {
        System.out.println("I invented a new word \nplagiarism");
    }

    public static void main(String[] args) {
        joke();
        int [] marks = {50,70,80,80,81};
        int x = 45;
        // Changing the integer
        change(x);
        System.out.println("The value of x after change is : "+ x);
        //It will not change because we create a copy of the variable
        //Changing the array
        change2(marks);
        System.out.println("The value after changing the array is "+marks[0]);
        // It will change because it makes an array object and passes the marks array as reference

    }
}
