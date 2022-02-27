package com.company02;

public class Fee {
    private String customerType;
    private final Integer baseFee = 1000;

    public Fee(String customerType) {
        this.customerType = customerType;
    }

    public Integer getFee(){
        Integer fee = baseFee;
        if (isChild()){
            fee = childFee();
        }
        return fee;
    }

    private Boolean isChild() {
        return this.customerType.equals("child");
    }

    private Integer childFee() {
        return (int)Math.round(baseFee * 0.5);
    }

    @Override
    public String toString() {
        return "Fee{" +
                "customerType='" + customerType + '\'' +
                ", fee=" + getFee() +
                '}';
    }
}
