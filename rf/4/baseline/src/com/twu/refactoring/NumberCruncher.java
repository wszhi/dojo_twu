package com.twu.refactoring;

public class NumberCruncher  {
    private final int[] numbers;
    private int count = 0;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        return calculateCount(new CountEven());
    }

    public int countOdd() {
        return calculateCount(new CountOdd());
    }

    public int countPositive() {
        return calculateCount(new CountPositive());
    }

    public int countNegative() {
        return calculateCount(new CountNegative());
    }

    private int calculateCount(CountAction countAction) {
        for (int number : numbers) {
            if (countAction.condition(number)) count++;
        }
        return count;
    }
}
