package com.company;
interface Camera{
    void take_snap();
    void video();
}
interface Wifi{
    String[] Get_Network();
    void ConnectToNetwork(String Network);
}
class MyPhone{
    void Call(int Number){
        System.out.println("Calling "+Number);
    }
    void Pick(){
        System.out.println("Connecting Your Call ......!");
    }
}
class MySmartPhone extends MyPhone implements Wifi,Camera{
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
public class default_methods1 {
    public static void main(String[] args) {
        MySmartPhone m = new MySmartPhone();
        String[] ar = m.Get_Network();
        for (String i:ar){
            System.out.println(i);
        }
        m.Call(8527272);
        m.Pick();
    }
}
