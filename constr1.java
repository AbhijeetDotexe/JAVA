package com.company;
class MyEmp1 {
    private int id;
    private String Name;

    public MyEmp1() {
        id = 4;
        Name = "Lakshay";
    }

    public MyEmp1(String myName) {
        id = 4;
        Name = myName;
    }
    public MyEmp1(String myName, int f) {
        id = f;
        Name = myName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
    public class constr1 {
        public static void main(String[] args) {
            MyEmp1 Lakshay = new MyEmp1("Priyanshu",23);
            System.out.println(Lakshay.getName());
            System.out.println(Lakshay.getId());
        }
    }




