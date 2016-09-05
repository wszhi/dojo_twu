package com.twu.refactoring;


public interface DateValidation {
    boolean isYearInvalid(int year);
    boolean isMonthInvalid(int month);
    boolean isDateInvalid(int date);
    boolean isHourInvalid(int hour);
    boolean isMinuteInvalid(int minute);
}
