package com.twu.refactoring;

public class CountPositive implements CountAction {
    @Override
    public boolean condition(int number) {
        return number >= 0;
    }
}
