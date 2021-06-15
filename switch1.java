package com.company;
import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your age : ");
        int age = s.nextInt();
        switch (age) { //Enhanced Switch statements
            case 18 -> System.out.println("You are eligible for a driving license, Good Luck !");
            case 23 -> System.out.println("You are Ready for a job, Good Luck!");
            case 60 -> System.out.println("It's Time for you to get retired !");
            default -> System.out.println("Enjoy your life");
        }
    }
}
