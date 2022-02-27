package com.company03.company02;

public class Fee {
    private String customerType;
    private final Integer baseFee = 1000;

    public Fee(String customerType) {
        this.customerType = customerType;
    }

    public Integer getFee(){
        Integer fee;
        if (isChild()){
            fee = childFee();
        } else if (isSenior()) {
            fee = seniorFee();
        } else {
            fee =  adultFee();
        }
        return fee;
    }

    private Integer adultFee() { return baseFee;}

    private Boolean isChild() {
        return this.customerType.equals("child");
    }

    private Boolean isSenior() {return this.customerType.equals("senior"); }

    private Integer childFee() {
        return (int)Math.round(baseFee * 0.5);
    }

    private Integer seniorFee() { return (int)Math.round(baseFee * 0.7); }

    @Override
    public String toString() {
        return "Fee{" +
                "customerType='" + customerType + '\'' +
                ", fee=" + getFee() +
                '}';
    }
}
