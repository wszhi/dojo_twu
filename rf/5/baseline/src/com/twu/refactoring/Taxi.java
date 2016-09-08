package com.twu.refactoring;

public class Taxi {
    private boolean airConditioned;
    private final int totalKms;
    private final boolean peakTime;
    private final double priceForKM = 15;
    private final double priceForLessTenKM = 12;
    private final double PEAK_TIME = 1.2;
    private final double NOT_PEAK_TIME = 1.0;
    private final double MORE_PRICE = 5;
    private final double TEN_KM = 10;
    private final double ZERO_KM = 0;

    public Taxi(boolean airConditioned, int totalKms, boolean peakTime) {
        this.airConditioned = airConditioned;
        this.totalKms = totalKms;
        this.peakTime = peakTime;
    }

    public double peakTimeMultiple() {
        return peakTime ? PEAK_TIME : NOT_PEAK_TIME;
    }

    public double getPriceForMoreThanTenKM() {
        return airConditioned ? priceForKM + MORE_PRICE : priceForKM;
    }

    public double getPriceForLessThanTenKM() {
        return airConditioned ? priceForLessTenKM + MORE_PRICE : priceForLessTenKM;
    }

    public double getTotalCostForMoreThanTenKms() {
        return Math.min(TEN_KM, totalKms) * getPriceForMoreThanTenKM() * peakTimeMultiple();
    }

    public double getTotalCostForLessThanTenKms() {
        return Math.max(ZERO_KM, totalKms - TEN_KM) * getPriceForLessThanTenKM() * peakTimeMultiple();
    }
}
