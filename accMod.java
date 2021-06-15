package com.company;
class MyEmployee{
    private int id ;
    private String Name;
    public String getName(){
        return Name;
    }
    public void setName(String n)
    {
        Name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class accMod {
    public static void main(String[] args) {
        MyEmployee Lakshay = new MyEmployee();
        //Lakshay.id = 4;
        //Lakshay.Name = "Priyanshu";
        // Throws and error due to private access modifiers
        Lakshay.setName("Priyanshu");
        Lakshay.setId(4);
        System.out.println(Lakshay.getName());
        System.out.println(Lakshay.getId());


    }
}
