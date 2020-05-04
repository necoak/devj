package saleabstractfactory.liquor;

import saleabstractfactory.sale.Product;
import saleabstractfactory.sale.SaleFactory;
import saleabstractfactory.sale.Tax;
import saleabstractfactory.tax.NormalTax;

public class LiquorSaleFactory implements SaleFactory {
    @Override
    public Product getProduct() {
        return new Liquor();
    }

    @Override
    public Tax getTax() {
        return new NormalTax();
    }
}
