package com.company;
class Circle{
    public int radius;
    Circle(int a){
        System.out.println("I am a Parameterized Constructor for Class Circle !");
        this.radius =a;
    }
    public double area(){
        System.out.println("The Area of the circle is ");
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h){
        super(r); // Tells u which Constructor of the Parent class
        this.height = h;
    }
    public double volume(){
        System.out.println("The Volume of the Cylinder is ");
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class set8 {
    public static void main(String[] args) {
        Circle ci = new Circle(4);
        System.out.println(ci.area());
        Cylinder1 c = new Cylinder1(12,4);
        System.out.println(c.volume());

    }
}
