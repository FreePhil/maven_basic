package com.hengetech.simple_demo.exercises._03;

public class GregorianLeapYearCalculator implements LeapYearCalculator{
    @Override
    public boolean isLeap(long year) {

        // Implement here
        //
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
