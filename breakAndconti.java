package com.company;

public class breakAndconti {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++)
        {
            System.out.println(i);
            if(i==2)
            {
                System.out.println("Ending the loop");
                //break;
                continue;
            }

            System.out.println("Java is so much better than cpp");
        }
    }
}
