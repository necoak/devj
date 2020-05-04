package saleabstractfactory.sale;

public interface SaleFactory {
    Product getProduct();
    Tax getTax();
}
