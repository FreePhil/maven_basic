package com.hengetech.simple_demo.exercises._04;

public class ChineseWeekday implements Weekday {
    @Override
    public String getName(int weekday) {
        String prefix = "星期";
        String name = "";

        switch (weekday) {
            case 0:
                name = "天";
                break;
            case 1:
                name = "一";
                break;
            case 2:
                name = "二";
                break;
            case 3:
                name = "三";
                break;
            case 4:
                name = "四";
                break;
            case 5:
                name = "五";
                break;
            case 6:
                name = "六";
                break;
        }

        return prefix + name;
    }
}
