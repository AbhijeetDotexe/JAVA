package com.company;

public class ErrorsAndException1 {
    public static void main(String[] args) {
//        System.out.println(2);
        for (int i = 1; i < 100; i++) {
            boolean isprime =true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
