package com.company;
public class operator1 {
        int logic(int x, int y)
        {
            int z;
            if(x>y)
            {
                z=x+y;
            }
            else
            {
                z = (x+y)*5;
            }
            return z;
        }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        operator1 obj = new operator1();//if we don't want to use the static keyword we need to create a object of class
        int c =obj.logic(a,b);
        System.out.println(c);
    }
}
