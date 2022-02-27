package com.company;

public class Fee {
    private String customerType;
    private final Integer baseFee = 1000;

    public Fee(String customerType) {
        this.customerType = customerType;
    }

    public Integer getFee(){
        Integer fee = baseFee;
        if (this.customerType.equals("child")) {
            fee = (int)Math.round(baseFee * 0.5);
        }
        return fee;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "customerType='" + customerType + '\'' +
                ", fee=" + getFee() +
                '}';
    }
}
