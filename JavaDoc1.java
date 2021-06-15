package com.company;

/**
 * This is just for demonstration purpose
 * @author Abhijeet
 * @version 1
 * @since 2000
 * @see <a href = " https://docs.oracle.com/en/java/javase/16/docs/api/index.html" target="_blank">Docs</a>
 */
public class JavaDoc1 {
    public void add(int a, int b){
        System.out.println("The sum of the two numbers is : "+(a+b));
    }

    public static void main(String[] args) {
        System.out.println("This is my Main Method");
        JavaDoc1 a = new JavaDoc1();
        a.add(3,4);
    }
}
