package com.company05;

public enum FeeType {
    adult(new AdultFee()),
    child(new ChildFee()),
    senior(new SeniorFee()),
    baby(new BabyFee());

    private Fee fee;

    private FeeType(Fee fee) {
        this.fee = fee;
    }

    public Integer getFee() {
        return this.fee.getFee();
    }

    public String label() {
        return this.fee.label();
    }
}
