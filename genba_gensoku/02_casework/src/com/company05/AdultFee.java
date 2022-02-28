package com.company05;

public class AdultFee implements Fee {
    @Override
    public Integer getFee() {
        return baseFee;
    }

    @Override
    public String label() {
        return "adult";
    }
}
