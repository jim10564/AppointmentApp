package com.wsu.cs;

/**Abstract class representing an Appointment
 *Superclass of Monthly, Daily, and OneTime
 */

public abstract  class Appointment {
    String description;

    /**
     * Constructs an Appointment objects
     * @param reminder-String that describes the appointment object
     */

    public Appointment(String reminder) {
        description = reminder;
    }

    /**Can change the description instance Variable after
     * the object has been created
     * @param description-String that describes the appointment object
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Checks whether an appointment object occurs on a user supplied date
     * returns true if user supplied date matches the date of the Appointment object
     * @param year, int year of appointment
     * @param month, int month of appointment
     * @param day, int day of appointment
     * @return boolean
     */

    public   abstract  boolean occursOn(int year, int month, int day);

    /**
     * Prints a String describing the appointment object
     * @return String description,
     */
    public String toString() {
       return (description);
    }
}
