package com.example.thyemleaf_sample;

import lombok.Data;

import java.util.List;

@Data
public class ProductList {
    private List<Product> products;

    public void addList() {
        products.add(new Product());
    }

    public void removeList(int index) {
        if (products.size() > 1) {
            products.remove(index);
        }
    }
}
