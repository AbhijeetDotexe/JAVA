package com.company;
import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int user_inp;
    public int number_of_guess = 0;
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(50);
    }
        void take_inp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess The Number");
        user_inp = sc.nextInt();
    }
    public boolean isCorrectNumber(){
            number_of_guess++;
        if(user_inp == number)
        {
            System.out.format("You Guessed the number right, The Number was %d and it Took %d attempts for u to guess the Correct Number ",number,number_of_guess);
            return true;
        }
        else if(user_inp<number)
        {
            System.out.println("Your Guess is less than the Number!");
        }
        else
        {
            System.out.println("Your Guess is Higher than the Number!");
        }
        return false;
    }
}
public class Guess_the_number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.take_inp();
            b = g.isCorrectNumber();
        }
    }
}
