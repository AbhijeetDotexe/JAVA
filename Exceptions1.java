package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString()+"I am toString";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+" I am Get Message";
    }
}
public class Exceptions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        if(a<20){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e); // if u write only e then to string method will be called
                e.printStackTrace(); // This doesn't give an error the program after will run normally
            }
        }
    }
}
