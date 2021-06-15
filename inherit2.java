package com.company;
class Base1{
    public int x;
    Base1(){
        System.out.println("I am a Constructor in base 1");
    }
    Base1(int a){
        System.out.println("I am an Overloaded Constructor with value of a as "+a);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    public int y;
    Derived1(){
        super(20);
        System.out.println("I am a Constructor in Derived 1");
    }
    Derived1(int x, int y){
        System.out.println("I am an Overloaded Constructor in Derived class 1 with value of X as "+x+"and Y as "+ y );
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inherit2 {
    public static void main(String[] args) {
        Base1 b = new Base1(4);
        Derived1 d = new Derived1(22,23);
    }
}
