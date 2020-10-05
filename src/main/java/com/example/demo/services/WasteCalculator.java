package com.example.demo.services;

import java.time.LocalDate;

public class WasteCalculator {
    LocalDate now = LocalDate.now();
    int daysSinceNewYear = now.getDayOfYear();

    public int totalWasteThisYearInTons(){
        return (int) Math.round(daysSinceNewYear*1917.8);
    }

    public int householdsCombinedWasteThisYearInTons(){
        return (int) Math.round(daysSinceNewYear*712.3);
    }

    public int averagePersonWasteThisYearInKG(){
        return (int) Math.round((daysSinceNewYear*128.7)/1000);
    }

    public int getCurrentYear(){
        return now.getYear();
    }
}
