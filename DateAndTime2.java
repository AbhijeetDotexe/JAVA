package com.company;

import java.util.Date;

public class DateAndTime2 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getHours());
        System.out.println(d.getYear()); // Starts From Year 1900
        System.out.println(d.getDay());
    }
}
