package com.company;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in the base class and setting x now ");
        this.x = x;
    }

    public void print(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        System.out.println("I am in Derived class now and setting the value of y");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inherit1 {
    public static void main(String[] args) {
        Derived b = new Derived();
        b.setX(4);
        System.out.println(b.getX());
        Derived c =new Derived();
        c.setY(20);
        System.out.println(c.getY());
    }
}
