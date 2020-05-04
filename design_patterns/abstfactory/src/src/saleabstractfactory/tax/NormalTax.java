package saleabstractfactory.tax;

import saleabstractfactory.sale.Tax;

public class NormalTax extends Tax {
    public NormalTax() {
        this.taxPercent = 10;
    }
}
