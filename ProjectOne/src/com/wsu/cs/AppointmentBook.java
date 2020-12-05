package com.wsu.cs;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @ author Jim Spisto
 * Date 09/17/2020
 * @ version 1
 *Build on the Appointment hierarchy.
 Give the user the option to add new appointments.
 The user must specify the type of the appointment and
 description, and then, if required, the day or date.
 */
public class AppointmentBook {
    //An ArrayList of Appointment objects
    ArrayList<Appointment> apptList = new ArrayList<Appointment>();

    /**
     Adds a new Appointment object based on user input.
     @param in the Scanner to read from.
     */
   public void addAppointment(Scanner in) {
       System.out.println("Enter type [(D)aily, (M)onthly, (O)netime] and description:");
       String userInput = in.nextLine();
       char appType = Character.toUpperCase(userInput.charAt(0));
       String description = userInput.substring(2);

           if (appType == 'D') {
               Daily userDaily = new Daily(description);
               apptList.add(userDaily);
           } else if (appType == 'M') {
               System.out.println("Enter the day of the appointment: ");
               int userDay = in.nextInt();
               //System.out.println(userDay);
               Monthly userMonthly = new Monthly(userDay, description);
               //System.out.println(userMonthly);
               apptList.add(userMonthly);
           } else if (appType == 'O') {
               System.out.println("Enter the date of the appointment (mm dd yyyy)");
               String userDate = in.nextLine();
               int userMonth = Integer.parseInt(userDate.substring(0, 2));
               int userDay = Integer.parseInt(userDate.substring(3, 5));
               int userYear = Integer.parseInt(userDate.substring(6));
               OneTime userOneTime = new OneTime(userYear, userMonth, userDay, description);
               apptList.add(userOneTime);
           }
           else{
               System.out.println("Invalid input");
           }
    }

    /**
     Method to print all appointments on a certain date.
     @param in the Scanner to read from.
     */
   public void findAppointments(Scanner in)
    {
        System.out.print("Enter date(mm dd yyyy) to search: ");
        String userDate = in.nextLine();
        int userMonth = Integer.parseInt(userDate.substring(0, 2));
        int userDay = Integer.parseInt(userDate.substring(3, 5));
        int userYear = Integer.parseInt(userDate.substring(6));
        for (Appointment ap : apptList){
            if (ap.occursOn(userYear,userMonth,userDay)){
                System.out.println(ap);
            }
        }
    }

    // Just to test the appointment book
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        AppointmentBook ab = new AppointmentBook();

        System.out.println("Welcome to the Appointment Book");
        System.out.println("-------------------------------");

        boolean done = false;
        while (!done)
        {
            System.out.print("Appointments: (F)ind, (A)dd, or (Q)uit: ");
            String choice = in.next();
            if (choice.equals("F") || choice.equals("f"))
            {
                ab.findAppointments(new Scanner(System.in));
            }
            else if (choice.equals("A") || choice.equals("a"))
            {
                ab.addAppointment(new Scanner(System.in));
            }
            done = choice.equals("Q") || choice.equals("q");
        }
        System.out.println("Good bye.  Have a nice day!");
        in.close();
    }
}

