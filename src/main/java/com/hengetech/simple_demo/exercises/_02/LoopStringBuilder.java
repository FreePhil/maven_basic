package com.hengetech.simple_demo.exercises._02;

public class LoopStringBuilder implements StringBuilder{
    @Override
    public String concatenate(int number) {

        // Implement here
        //
        String result = "";
        for (int i = 0; i < number; i++) {
            result = result + ",loop" + (i+1);
        }

        if (result.length() > 0) {
            result = result.substring(1);
        }

        return result;
    }
}
