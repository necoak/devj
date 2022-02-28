package com.company05;

public class SeniorFee implements Fee {
    @Override
    public Integer getFee() {
        return (int)Math.round(baseFee * 0.7);
    }

    @Override
    public String label() {
        return "senior";
    }
}
