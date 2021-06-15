package com.company;
class One{
    public void greet(){
        System.out.println("Good Morning!");
    }
    public void name(){
        System.out.println("My name is Java in class 1");
    }
}
class Two extends One{
    @Override
    public void name(){
        System.out.println("My name is Java in class two as well");
    }
    public void greet1(){
        System.out.println("Morning!");
    }
}
public class dynamic_dispatch1 {
    public static void main(String[] args) {
//        One o = new One();
//        o.greet();
//        o.name();
//        Two o1 = new Two();
//        o1.greet1();
//        o1.name();
        One o = new Two();
        o.greet();
        o.name();
    }
}
