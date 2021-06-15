package com.company;
import java.util.Scanner;
public class practiceset2 {
    public static void main(String[] args)
    {
        char grade = 'B';
        grade = (char)(grade+8); // u need to typecast to add 8 in a char value
        System.out.println("Grade before decryption is "+ grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println("Grade after decryption is "+grade);

    }

}
