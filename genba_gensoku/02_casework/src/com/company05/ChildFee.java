package com.company05;

public class ChildFee implements Fee {
    @Override
    public Integer getFee() {
        return (int)Math.round(baseFee * 0.5);
    }

    @Override
    public String label() {
        return "child";
    }
}
