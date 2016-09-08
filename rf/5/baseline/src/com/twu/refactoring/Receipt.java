package com.twu.refactoring;

public class Receipt {
    private final Taxi taxi;
    private final static double FIXED_CHARGES = 50;
    private final static double SALES_TAX = 0.1;
    private final static double BASIC_COST = 1;

    public Receipt(Taxi taxi) {
        this.taxi = taxi;
    }

    public double totalCost() {
        double totalCost = FIXED_CHARGES;

        totalCost += taxi.getTotalCostForMoreThanTenKms();
        totalCost += taxi.getTotalCostForLessThanTenKms();

        return totalCost * (BASIC_COST + SALES_TAX);
    }
}
