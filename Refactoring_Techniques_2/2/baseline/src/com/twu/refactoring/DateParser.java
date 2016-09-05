package com.twu.refactoring;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

public class DateParser {
    private final String dateAndTimeString;
    private static final String TIME_ZONES = "UTC";
    private static int ZERO = 0;
    private static int YEAR_END = 4;
    private static int MONTH_END = 7;
    private static int DATE_END = 10;
    private static int HOUR_END = 13;
    private static int MINUTE_END = 16;
    private static final HashMap<String, TimeZone> KNOWN_TIME_ZONES = new HashMap<String, TimeZone>();

    static {
        KNOWN_TIME_ZONES.put(TIME_ZONES, TimeZone.getTimeZone(TIME_ZONES));
    }

    /**
     * Takes a date in ISO 8601 format and returns a date
     *
     * @param dateAndTimeString - should be in format ISO 8601 format
     *                          examples -
     *                          2012-06-17 is 17th June 2012 - 00:00 in UTC TimeZone
     *                          2012-06-17TZ is 17th June 2012 - 00:00 in UTC TimeZone
     *                          2012-06-17T15:00Z is 17th June 2012 - 15:00 in UTC TimeZone
     */
    public DateParser(String dateAndTimeString) {
        this.dateAndTimeString = dateAndTimeString;
    }

    public Date parse(DateValidation validator) {

        int year, month, date, hour, minute;

        year = isYearValid(validator);

        month = isMonthValid(validator);

        date = isDateValid(validator);

        if (dateAndTimeString.substring(11, 12).equals("Z")) {
            hour = ZERO;
            minute = ZERO;
        } else {
            hour = isHourValid(validator);
            minute = isMinuteValid(validator);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone(TIME_ZONES));
        calendar.set(year, month - 1, date, hour, minute, ZERO);
        calendar.set(Calendar.MILLISECOND, ZERO);
        return calendar.getTime();
    }

    private int isMinuteValid(DateValidation validator) {
        int minute;
        try {
            String minuteString = dateAndTimeString.substring(HOUR_END+1, MINUTE_END);
            minute = Integer.parseInt(minuteString);
        } catch (StringIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Minute string is less than 2 characters");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Minute is not an integer");
        }
        if (validator.isMinuteInvalid(minute))
            throw new IllegalArgumentException("Minute cannot be less than 0 or more than 59");
        return minute;
    }

    private int isHourValid(DateValidation validator) {
        int hour;
        try {
            String hourString = dateAndTimeString.substring(DATE_END+1, HOUR_END);
            hour = Integer.parseInt(hourString);
        } catch (StringIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Hour string is less than 2 characters");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Hour is not an integer");
        }
        if (validator.isHourInvalid(hour))
            throw new IllegalArgumentException("Hour cannot be less than 0 or more than 23");
        return hour;
    }

    private int isDateValid(DateValidation validator) {
        int date;
        try {
            String dateString = dateAndTimeString.substring(MONTH_END+1, DATE_END);
            date = Integer.parseInt(dateString);
        } catch (StringIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Date string is less than 2 characters");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Date is not an integer");
        }
        if (validator.isDateInvalid(date))
            throw new IllegalArgumentException("Date cannot be less than 1 or more than 31");
        return date;
    }

    private int isMonthValid(DateValidation validator) {
        int month;
        try {
            String monthString = dateAndTimeString.substring(YEAR_END+1, MONTH_END);
            month = Integer.parseInt(monthString);
        } catch (StringIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Month string is less than 2 characters");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Month is not an integer");
        }
        if (validator.isMonthInvalid(month))
            throw new IllegalArgumentException("Month cannot be less than 1 or more than 12");
        return month;
    }

    private int isYearValid(DateValidation validator) {
        int year;
        try {
            String yearString = dateAndTimeString.substring(ZERO, YEAR_END);
            year = Integer.parseInt(yearString);
        } catch (StringIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Year string is less than 4 characters");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Year is not an integer");
        }
        if (validator.isYearInvalid(year))
            throw new IllegalArgumentException("Year cannot be less than 2000 or more than 2012");
        return year;
    }
}
