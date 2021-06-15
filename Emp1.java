package com.company;
class Emp{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return  name;
    }
    public void setName(String n){
        name = n;
    }
}
class Phone{
    public void Ring(){
        System.out.println("Phone is ringing......");
    }
    public void vibrating(){
        System.out.println("Phone is vibrating .......");
    }
    public void call(){
        System.out.println("You are calling someone!");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void fire(){
        System.out.println("Firing the Gun on the enemy");
    }
    public void running(){
        System.out.println("Running from the Police");
    }
}
public class Emp1 {
    public static void main(String[] args) {
        Emp Lakshay = new Emp();
        Lakshay.setName("Priyanshu");
        Lakshay.salary = 40000;
        System.out.println(Lakshay.getName());
        System.out.println(Lakshay.getSalary());

        //Problem 2
        Phone Mi =new Phone();
        Mi.call();
        Mi.vibrating();
        Mi.Ring();

        //Problem 3
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //Problem 4
        Tommy T = new Tommy();
        T.running();
        T.fire();
        T.hit();
    }
}
