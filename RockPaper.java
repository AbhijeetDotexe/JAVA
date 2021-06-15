package com.company;
import java.util.Scanner;
import java.util.Random;
public class RockPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor ");
        int UserInp = sc.nextInt();
        Random r = new Random();
        int computerInp = r.nextInt(3);
        if(UserInp==computerInp)
        {
            System.out.println("OOPS This Game is a Tie!");
        }
        else if(UserInp==0 &&computerInp==2 ||UserInp==1 && computerInp==0 ||UserInp ==2 && computerInp==1)
        {
            System.out.println("You Win!");
        }
        else{
            System.out.println("You loose and Computer Wins!");
        }
        System.out.println("Computers Input = "+ computerInp);
        if(computerInp==0)
        {
            System.out.println("Computer Choice is : Rock");
        }
        else if(computerInp==1)
        {
            System.out.println("Computer Choice is : Paper");
        }
        else{
            System.out.println("Computer Choice is : Scissor");
        }
    }
}
