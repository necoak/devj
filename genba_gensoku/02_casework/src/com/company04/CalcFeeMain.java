package com.company04;

public class CalcFeeMain {
    public static void main(String[] args) {
        FeeFactory feeFactory = new FeeFactory();

        Fee fee01 = feeFactory.feeByNames("child");
        System.out.println(trFee2Txt(fee01));

        Fee fee02 = feeFactory.feeByNames("adult");
        System.out.println(trFee2Txt(fee02));

        Fee fee03 = feeFactory.feeByNames("senior");
        System.out.println(trFee2Txt(fee03));

        Fee fee04 = feeFactory.feeByNames("baby");
        System.out.println(trFee2Txt(fee04));
    }

    private static String trFee2Txt(Fee fee) {
        return fee.label()  + " : " + fee.getFee();
    }
}
