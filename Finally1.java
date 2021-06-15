package com.company;

public class Finally1 {
 public static int div(){
     try{
         int a =40;
         int b = 20;
         int c = a/b;
         return c;
     }
     catch (Exception e){
         System.out.println(e);
     }
     finally {
         System.out.println("This is the end of the program!");
     }
     return 0;
 }
    public static void main(String[] args) {
        int k = div();
        System.out.println(k);
    }
}
