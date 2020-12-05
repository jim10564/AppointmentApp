package com.wsu.cs;

/**
 * Represents a OneTime Appointment, extends Appointment
 */

public class OneTime extends Appointment {
    int day;
    int month;
    int year;

    /**
     * Constructs a Onetime object
     * @param year, int year of appointment
     * @param month, int month of appointment
     * @param day, int day of appointment
     * @param reminder, String describes appointmet
     */

    public OneTime(int year, int month, int day, String reminder){
        super(reminder);
        this.day = day;
        this.month = month;
        this.year = year;
    }
    /**
     * Checks whether a Monthly Daily occurs on a user supplied day
     * Returns true if the user supplied date matches the OneTime object
     * @param year, int year of appointment
     * @param month, int month of appointment
     * @param day, int day of appointment
     * @return boolean
     */

    @Override
    public boolean occursOn(int year, int month, int day) {
        return this.year == year && this.month == month && this.day == day;
    }

    }

