package saleabstractfactory;

import saleabstractfactory.food.FoodSaleFactory;
import saleabstractfactory.liquor.LiquorSaleFactory;
import saleabstractfactory.nonalchol.NonAlcholSaleFactory;
import saleabstractfactory.sale.Product;
import saleabstractfactory.sale.SaleFactory;
import saleabstractfactory.sale.Tax;

public class Main {

    public static void main(String[] args) {
        SaleFactory foodSale = new FoodSaleFactory();
        System.out.println("Food");
        printProductTax(foodSale);

        SaleFactory liquorSale = new LiquorSaleFactory();
        System.out.println("Liquor");
        printProductTax(liquorSale);

        SaleFactory nonAlcholSale = new NonAlcholSaleFactory();
        System.out.println("NonAlchol");
        printProductTax(nonAlcholSale);
    }

    private static void printProductTax(SaleFactory saleFactory) {
        Product product = saleFactory.getProduct();
        Tax tax = saleFactory.getTax();

        System.out.println(product + " / " + tax);
    }
}
