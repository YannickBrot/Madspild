package com.example.demo.services;

import java.time.LocalDate;

public class WasteCalculator {
    LocalDate now = LocalDate.now();
    int daysSinceNewYear = now.getDayOfYear();

    public double totalWasteThisYearInTons(){
        return daysSinceNewYear*1917.8;
    }

    public double householdsCombinedWasteThisYearInTons(){
        return daysSinceNewYear*712.3;
    }

    public double averagePersonWasteThisYearInGrams(){
        return daysSinceNewYear*128.7;
    }

}
