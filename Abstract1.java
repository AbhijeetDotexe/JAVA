package com.company;
abstract class Base2{
    Base2(){
        System.out.println("I am a constructor for base 2");
    }
    public void say_Hello(){
        System.out.println("Hello How are You!");
    }
    abstract public void Greet();
}
class Derived2 extends Base2{
    public void Greet(){
        System.out.println("Hello!");
    }
}
abstract class Derived3 extends Base2{
    public void Good(){
        System.out.println("I am Good, How are You?");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Base2 b = new Derived2();
        Derived2 d = new Derived2();
        //Derived3 e = new Derived3() Not possible because we cannot refer abstract class
    }
}
