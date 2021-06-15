package com.company;
class infinity1 extends Thread{
    public void run(){
        int i=1;
        int a =22;
        do {
            System.out.println(a+" * "+i+" = "+ i*a);
            i++;
        }while (true);

    }
}
public class infil {
        public static void main(String[] args) {
            infinity1 m = new infinity1();
            m.start();
        }
    }


