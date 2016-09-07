package com.twu.refactoring;


public class CountEven implements CountAction {
    @Override
    public boolean condition(int number) {
        return number %  2 == 0;
    }
}
