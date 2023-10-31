package com.hengetech.simple_demo.exercises._01;

public class RecursiveFibonacci implements Fibonacci {

    @Override
    public long compute(long number) {

        // Implement here
        //
        // compute(n) = compute(n-1) + compute(n-2)
        //
        // non-recursive

        if (number < 2) {
            return number;
        }
        else {
            long step1 = 0;
            long step2 = 1;

            long result = 0;
            for (int i = 2; i < number+1; i++) {
                result = step1 + step2;
                step1 = step2;
                step2 = result;
            }

            return result;
        }
    }
}
