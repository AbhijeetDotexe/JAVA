package com.company;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int [] marks = {81,80,80,70,60};
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        System.out.println(marks[2]);
//        System.out.println(marks[4]);
        String [] students = {"Lakshay","priyanshu","nonu","shaani"};
        System.out.println(students.length);
        System.out.println(students[0]);
        System.out.println(students[2]);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("\n Displaying in reverse order");
        for(int j = marks.length-1;j>=0; j--)
        {
            System.out.println(marks[j]);
        }
        System.out.println("displaying using for each loop");
        for(String element:students)
        {
            System.out.println(element);
        }

    }
}
