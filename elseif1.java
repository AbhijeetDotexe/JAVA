package com.company;
import java.util.Scanner;
public class elseif1 {
    public static void main(String[] args) {

        System.out.println("Enter Your age and find out how experienced you are ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>50)
        {
            System.out.println("You are experienced enough !");
        }
        else if (age>40)
        {
            System.out.println("You are semi experienced ! ");
        }
        else if (age>30){
            System.out.println("You are a beginner! ");
        }
        else
        {
            System.out.println("You have no experience get better kid!");
        }

    }
}
