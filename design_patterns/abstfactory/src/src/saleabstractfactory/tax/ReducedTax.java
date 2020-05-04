package saleabstractfactory.tax;

import saleabstractfactory.sale.Tax;

public class ReducedTax extends Tax {
    public ReducedTax() {
        this.taxPercent = 8;
    }
}
