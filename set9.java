package com.company;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    public void write(){
        System.out.println("Writing with the Pen");
    }
    public void refill(){
        System.out.println("Refilling the Pen");
    }
}
public class set9 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
    }
}
