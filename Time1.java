package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time1 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E   a");
        //System.out.println(df);
        String myDate = dt.format(df);
        System.out.println(myDate);
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String MyDate2 = dt.format(df2);
        System.out.println(MyDate2);
    }
}
