package com.company;

public class varargs1 {
//    static int sum(int a, int b)
//    {
//        int c = a+b;
//        return c;
//    }
//    static int sum(int a,int b, int c)
//    {
//        int d = a+b+c;
//        return d;
//    }
    static int sum(int ...arr)
    {
       // Available as int[] arr
        int s = 0;
        for(int element:arr)
        {
            s +=element;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("The Sum of a and b is : "+ sum(4,5));
        System.out.println("The Sum of a,b and c is : "+ sum(4,5,9));
        System.out.println("The Sum of a,b and c is : "+ sum(1,2,3,4,5,6,7,8,9,10));
    }
}
