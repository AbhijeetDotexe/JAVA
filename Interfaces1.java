package com.company;
interface Bicycle{
    int a = 23;
    void apply_brake(int decrement);
    void speed_up(int increment);
}
class Avon_cycle implements Bicycle {
    void Horn(){
        System.out.println("Using Horn");
    }
    public void apply_brake(int decrement){
        System.out.println("Applying Brakes!");
    }
    public void speed_up(int increment){
        System.out.println("Speeding Up");
    }
}
public class Interfaces1 {
    public static void main(String[] args) {
        Avon_cycle c= new Avon_cycle();
        c.apply_brake(4);
        c.Horn();
        c.speed_up(5);
        //You cannot create properties in interface
        //You cannot modify the properties in interface as they are final
        System.out.println(c.a);
    }
}
