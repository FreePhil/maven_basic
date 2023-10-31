package com.hengetech.simple_demo.exercises._04;

public class EnglishWeekday implements Weekday {
    @Override
    public String getName(int weekday) {
        String name = "";

        switch(weekday) {
            case 0:
                name = "Sunday";
                break;
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
        }

        return name;
    }
}
