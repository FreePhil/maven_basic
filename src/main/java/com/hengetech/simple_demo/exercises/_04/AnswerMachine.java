package com.hengetech.simple_demo.exercises._04;

public class AnswerMachine {

    public Weekday weekDay;
    public AnswerMachine(String language) {
        switch (language) {
            case "zh":
                weekDay = new ChineseWeekday();
                break;
            case "jp":
                weekDay = new JapaneseWeekday();
                break;
            case "en":
            default:
                weekDay = new EnglishWeekday();
        }
    }

    public String getName(int weekday) {
        return weekDay.getName(weekday);
    }
}
