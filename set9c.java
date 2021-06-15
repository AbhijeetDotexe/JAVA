package com.company;
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("Jumping......!");
    }
    void bite(){
        System.out.println("Biting......Yikes!");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating......!");
    }
    public void sleep(){
        System.out.println("Sleeping ...... See You later !");
    }
}
public class set9c {
    public static void main(String[] args) {
        Human h = new Human();
        h.jump();
        h.eat();
        h.bite();
        h.sleep();
        Monkey m = new Human(); // Polymorphism
        m.bite();
        m.jump();
    }
}
