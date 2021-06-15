package com.company;
import java.util.Locale;
import java.util.Scanner;

public class strings1 {
    public static void main(String[] args)
    {
        String name = new String("Lakshay");
        System.out.print("The name is ");
        System.out.println(name);
        String name2 = "Priyanshu";
        System.out.println(name2);
        int a =4;
        float b = 20.876f;
        System.out.printf("The value of a is %d and the value of b is %f",a,b);
        System.out.format("\nThe value of a is %d and the value of b is %f\n",a,b);
        // %d is called format specifier
       // Scanner sc = new Scanner(System.in);
        //String st = sc.nextLine(); // prints the complete line
        //String st =sc.next();  prints only the first word of the line
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.length());
        String nontrim = "           Lakshay             " ;
        System.out.println(nontrim.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,6));
        System.out.println(name.replace("L","D"));
        System.out.println(name.startsWith("L"));
        System.out.println(name.endsWith("shay"));
        //System.out.println(st);
    }

}
