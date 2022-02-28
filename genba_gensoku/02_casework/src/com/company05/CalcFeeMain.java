package com.company05;

public class CalcFeeMain {
    public static void main(String[] args) {

        FeeType fee01 = FeeType.valueOf("child");
        System.out.println(trFee2Txt(fee01));

        FeeType fee02 = FeeType.valueOf("adult");
        System.out.println(trFee2Txt(fee02));

        FeeType fee03 = FeeType.valueOf("senior");
        System.out.println(trFee2Txt(fee03));

        FeeType fee04 = FeeType.valueOf("baby");
        System.out.println(trFee2Txt(fee04));
    }

    private static String trFee2Txt(FeeType feeType) {
        return feeType.label()  + " : " + feeType.getFee();
    }
}
