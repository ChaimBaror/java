package com.company.MapLernnig;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public class MyDate {
        private int day, month, year;
        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        @Override
        public String toString() {
            return day + "/" + month + "/" + year;
        }
    }

    public  HashMap<String, MyDate> birthdays = new HashMap<String, MyDate>();

    public HashMapClass() {
        birthdays.put("Sheldon", new MyDate(26, 2, 1980));
        birthdays.put("Penny", new MyDate(2, 12, 1986));
        birthdays.put("Rajesh", new MyDate(6, 10, 1981));


        for (Map.Entry<String, MyDate> e : birthdays.entrySet()) {
            System.out.println(e.getKey() + " --> " + e.getValue());
        }
    }
}
