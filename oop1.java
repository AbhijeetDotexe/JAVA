package com.company;
class Employee {
    int id;
    String name;
    int salary;
    public void print()
    {
        System.out.println("My Name is "+name+" and,");
        System.out.println("My Id is "+id);
    }
    public int getSalary()
    {
        return salary;
    }


}
public class oop1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class ");
        Employee Lakshay = new Employee();
        Employee Abhijeet = new Employee();

        //Setting attributes for Lakshay
        Lakshay.id = 4;
        Lakshay.name = "Priyanshu Rawat";
        Lakshay.salary = 34000;

        //Setting attributes for Abhijeet
        Abhijeet.id=22;
        Abhijeet.name = "Abhijeet Rana";
        Abhijeet.salary = 40000;
        Lakshay.print();
        System.out.println("My Salary is "+Lakshay.getSalary());
        System.out.println();
        Abhijeet.print();
        System.out.println("My Salary is "+Abhijeet.getSalary());
    }
}
