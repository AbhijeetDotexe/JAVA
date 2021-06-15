package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calen1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTime().getDate());
        System.out.println(c.HOUR_OF_DAY);
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
        System.out.println(cal.getGregorianChange());
        System.out.println(cal.getTime());
        System.out.println(cal.getTimeZone());
    }
}
