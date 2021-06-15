package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Set11b {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(60);
        s.add(70);
        s.add(80);
        s.add(40);
        s.add(90);
        s.add(60);
        //System.out.println(s.stream().sorted());
        System.out.println(s);
        Date d = new Date();
        System.out.println(d);
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

    }
}
