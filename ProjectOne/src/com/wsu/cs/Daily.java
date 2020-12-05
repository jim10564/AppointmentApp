package com.wsu.cs;

/**
 * Represents a Daily Appointment, extends Appointment
 */

public class Daily extends Appointment {
    /**
     * Constructs a Daily object
     * @param reminder-String that describes Daily object
     */
    public Daily(String reminder) {
        super(reminder);
    }
    /**
     * Checks whether a Monthly Daily occurs on a user supplied day
     * Returns true if the user supplied date matches the Monthly object
     * @param year, int year of appointment
     * @param month, int month of appointment
     * @param day, int day of appointment
     * @return boolean
     * returns true for every Daily object
     */

   @Override
    public boolean occursOn(int year, int month, int day) {
        return true;
    }

}
