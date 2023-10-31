package com.hengetech.simple_demo.exercises._04;

public class JapaneseWeekday implements Weekday {
    static String suffix = "日";

    @Override
    public String getName(int weekday) {
        String name = "";

        switch (weekday) {
            case 0:
                name = "日曜";
                break;
            case 1:
                name = "月曜";
                break;
            case 2:
                name = "火曜";
                break;
            case 3:
                name = "水曜";
                break;
            case 4:
                name = "木曜";
                break;
            case 5:
                name = "金曜";
                break;
            case 6:
                name = "土曜";
                break;
        }

        return name + suffix;
    }
}
