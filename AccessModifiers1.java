package com.company;
class c1{
    public int x = 5;
    protected int y = 6;
    int z = 7;
    private int a = 8;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AccessModifiers1 {
    public static void main(String[] args) {
        c1 c = new c1();
        //c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a); We cant run a because it has private access in the package
    }
}
