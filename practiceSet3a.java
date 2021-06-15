package com.company;
import java.util.Locale;
import java.util.Scanner;
public class practiceSet3a {
    public static void main(String[] args) {
        String name = "Priyanshu";
        System.out.println(name.toLowerCase(Locale.ROOT));
        String name2= "Abhijeet rana";
        System.out.println(name2.replace(" ","_"));
        String letter = "Dear <|name|>, Thanks a lot ";
        System.out.println(letter.replace("<|name|>","Lakshay"));
        String mystring  = "This string contains           double and triple spaces  ";
        System.out.println(mystring.indexOf("  "));  // returns -1 if the string is not found
        System.out.println(mystring.indexOf("   ")); // shows the index value of the string u are searching for
        String myletter = "Dear Lakshay, This Java course is Nice. Thanks!";
        System.out.println(myletter);
        String myletter2 = "Dear Lakshay,\t This Java course is Nice. \nThanks!";
        System.out.println(myletter2);


    }
}
