package com.company;
import java.util.Scanner;
public class Errors3 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 4;
        marks[1] = 20;
        marks[2] = 16;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the array u want to access ");
        int a = sc.nextInt();
        System.out.println("Enter the number you want to divide with");
        int b = sc.nextInt();
        try{
            System.out.println("The value at index is "+ marks[a]);
            System.out.println("The value after division is "+(marks[a]/b));
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticExceptionException ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsExceptionException");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some Other Exception occured, OOPS!");
            System.out.println(e);
        }
    }
}
