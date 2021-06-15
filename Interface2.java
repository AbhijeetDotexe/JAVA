package com.company;
interface sample{
    void meth1();
    void meth2();
}
interface sample2 extends sample{
    void meth3();
    void meth4();
}
class MySample implements sample2{
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
    public void meth3(){
        System.out.println("Method 3");
    }
    public void meth4(){
        System.out.println("Method 4");
    }
}
public class Interface2 {
    public static void main(String[] args) {

    }
}
