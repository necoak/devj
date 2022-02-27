package com.company03;

public class Fee {
    private String customerType;
    private final Integer baseFee = 1000;

    public Fee(String customerType) {
        this.customerType = customerType;
    }

    public Integer getFee(){

        if (isBaby())
            return babyFee();
        if (isChild())
            return childFee();
        if (isSenior())
            return seniorFee();
        return adultFee();
    }

    private Integer adultFee() {
        return baseFee;
    }

    private Boolean isChild() {
        return this.customerType.equals("child");
    }

    private Boolean isSenior() {
        return this.customerType.equals("senior");
    }

    private Integer childFee() {
        return (int)Math.round(baseFee * 0.5);
    }

    private Integer seniorFee() {
        return (int)Math.round(baseFee * 0.7);
    }

    private boolean isBaby() {
        return this.customerType.equals("baby");
    }

    private Integer babyFee() {
        return 0;
    }


    @Override
    public String toString() {
        return "Fee{" +
                "customerType='" + customerType + '\'' +
                ", fee=" + getFee() +
                '}';
    }
}
