package com.company;
interface Camera1{
    void take_snap();
    void video();
}
interface Wifi1{
    String[] Get_Network();
    void ConnectToNetwork(String Network);
}
class MyPhone1{
    void Call(int Number){
        System.out.println("Calling "+Number);
    }
    void Pick(){
        System.out.println("Connecting Your Call ......!");
    }
}
class MySmartPhone1 extends MyPhone1 implements Wifi1,Camera1{
    public void take_snap(){
        System.out.println("Clicking a Picture!");
    }
    public String[] Get_Network(){
        System.out.println("Getting List of Networks");
        String[] Network_List = {"Lakshay","Priyanshu","Abhijeet"};
        return Network_List;
    }
    public void ConnectToNetwork(String network){
        System.out.println("Connecting To ....."+ network);
    }
    public void video(){
        System.out.println("Recording Video!");
    }

}
public class polymorphism1 {
    public static void main(String[] args) {
        Camera1 c =new MySmartPhone1(); // This is a Smartphone but use it as a Camera
        c.take_snap();
    }
}
