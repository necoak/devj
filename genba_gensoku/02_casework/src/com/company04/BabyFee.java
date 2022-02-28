package com.company04;

public class BabyFee implements Fee {

    @Override
    public Integer getFee() {
        return 0;
    }

    @Override
    public String label() {
        return "baby";
    }
}
