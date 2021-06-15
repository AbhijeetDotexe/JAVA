package com.company;
class My_class1{
    public int a;
    My_class1(int a){
        //this.a = v;
        this.a = a;
        System.out.println("The value of a is "+a);
    }

    public int getA() {
        return a;
    }

    public int return1(){
        return 1;
    }
}
class My_class2 extends My_class1{
    My_class2(int c){
        super(c);
        System.out.println("Now i am inside the 2 class and the value of c is "+c);
    }

}
public class this_and_super1 {
    public static void main(String[] args) {
        //My_class1 m = new My_class1(4);
        //System.out.println(m.getA());
        My_class2 n = new My_class2(20);
    }
}
