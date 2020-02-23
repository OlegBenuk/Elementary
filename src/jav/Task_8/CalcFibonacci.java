package jav.Task_8;

import java.util.ArrayList;
import java.util.List;

public class CalcFibonacci {
    long startNumber;
    long finishNumber;
    List<Long> fibonacciNumbersList = new ArrayList<>();

    public CalcFibonacci(long startNumber, long finishNumber) {
        this.finishNumber = finishNumber;
        this.startNumber = startNumber;
        changePlacesIfNeeds();
        fibonacciSequence(getFinishNumberLength(), finishNumber);
    }


    public CalcFibonacci(int parseInt) {
        fibonacciSequence(parseInt, (long) Math.pow(10, parseInt));
    }

    void changePlacesIfNeeds() {
       // (startNumber,finishNumber) -> {Integer.compare(startNumber,finishNumber)};

        if (startNumber > finishNumber) {
            long temp;
            temp = startNumber;
            startNumber = finishNumber;
            finishNumber = temp;
        }
    }

    int getFinishNumberLength() {
        int count = 1;
        while (finishNumber % 10 == 0) {
            finishNumber /= 10;
            count++;
        }
        return count;
    }



    Long[] mass;

    void fibonacciSequence(int determinsMassSize, long max) {
        FibonacciSequence fs = new FibonacciSequence(max);
    }
//        int massSize = 13;  //numbers in Fibonacci sequence with one digit
//        for (int i = 0; i < determinsMassSize; i++) {
//            massSize += 10;
//        }
//        mass = new Long[massSize];
//        mass[0] = 0L;
//        mass[1] = 1L;
//        int count = 1;




}
