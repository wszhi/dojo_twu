package com.twu.refactoring;

public class CountOdd implements CountAction {
    @Override
    public boolean condition(int number) {
        return number % 2 == 1;
    }
}
