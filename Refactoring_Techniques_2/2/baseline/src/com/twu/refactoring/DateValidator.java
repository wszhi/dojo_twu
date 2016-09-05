package com.twu.refactoring;


public class DateValidator implements DateValidation {

    public static final int YEAR_LOWER_BOUND = 2000;
    public static final int YEAR_UPPER_BOUND = 2012;
    public static final int MONTH_LOWER_BOUND = 1;
    public static final int MONTH_UPPER_BOUND = 12;
    public static final int DATE_UPPER_BOUND = 31;
    public static final int DATE_LOWER_BOUND = 1;
    public static final int HOUR_LOWER_BOUND = 0;
    public static final int HOUR_UPPER_BOUND = 23;
    public static final int MINUTE_LOWER_BOUND = 0;
    public static final int MINUTE_UPPER_BOUND = 59;

    @Override
    public boolean isYearInvalid(int year) {
        return year < YEAR_LOWER_BOUND || year > YEAR_UPPER_BOUND;
    }

    @Override
    public boolean isMonthInvalid(int month) {
        return month < MONTH_LOWER_BOUND || month > MONTH_UPPER_BOUND;
    }

    @Override
    public boolean isDateInvalid(int date) {
        return date < DATE_LOWER_BOUND || date > DATE_UPPER_BOUND;
    }

    @Override
    public boolean isHourInvalid(int hour) {
        return hour < HOUR_LOWER_BOUND || hour > HOUR_UPPER_BOUND;
    }

    @Override
    public boolean isMinuteInvalid(int minute) {
        return minute < MINUTE_LOWER_BOUND || minute > MINUTE_UPPER_BOUND;
    }
}
