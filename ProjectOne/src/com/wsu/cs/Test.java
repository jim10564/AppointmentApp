package com.wsu.cs;

public class Test {
    public static void main(String[] args) {
        //Appointment myEvent = new Appointment("walk dog");
        OneTime zoomCall = new OneTime(2020, 04, 12, "call grandma");
        Daily everyDay= new Daily("walk dog");
        Monthly everyMonth = new Monthly(15, "feed cat");


       System.out.println(everyMonth.occursOn(2024, 06, 16));
    }
}