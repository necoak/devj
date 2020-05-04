package saleabstractfactory.food;

import saleabstractfactory.sale.Product;
import saleabstractfactory.sale.SaleFactory;
import saleabstractfactory.sale.Tax;
import saleabstractfactory.tax.NormalTax;
import saleabstractfactory.tax.ReducedTax;

public class FoodSaleFactory implements SaleFactory {
    @Override
    public Product getProduct() {
        return new Food();
    }
    @Override
    public Tax getTax() {
        return new ReducedTax();
    }
}
