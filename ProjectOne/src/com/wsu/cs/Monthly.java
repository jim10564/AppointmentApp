package com.wsu.cs;

/**
 * Represents a Monthly appointment, extends Appointment
 */

public class Monthly extends Appointment {
    int day;

    /**
     * Constructs a Monthly object
     * @param day, int user supplied day
     * @param reminder, String user supplied description of Monthly object
     */

    public Monthly(int day, String reminder) {
        super(reminder);
        this.day = day;
    }

    /**
     * Checks whether a Monthly object occurs on a user supplied day
     * Returns true if the user supplied date matches the Monthly object
     * @param year, int year of appointment
     * @param month, int month of appointment
     * @param day, int day of appointment
     * @return boolean
     */

    @Override
    public boolean occursOn(int year, int month, int day) {
        if (this.day == day){
            return true;
        }
        else return false;
    }


}


