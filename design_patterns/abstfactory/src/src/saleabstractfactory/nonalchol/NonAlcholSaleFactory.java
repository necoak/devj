package saleabstractfactory.nonalchol;

import saleabstractfactory.sale.Product;
import saleabstractfactory.sale.SaleFactory;
import saleabstractfactory.sale.Tax;
import saleabstractfactory.tax.ReducedTax;

public class NonAlcholSaleFactory implements SaleFactory {
    @Override
    public Product getProduct() {
        return new NonAlcholBeer();
    }

    @Override
    public Tax getTax() {
        return new ReducedTax();
    }
}
