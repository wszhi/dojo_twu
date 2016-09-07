package com.twu.refactoring;

public class CountNegative implements CountAction {
    @Override
    public boolean condition(int number) {
        return number < 0;
    }
}
