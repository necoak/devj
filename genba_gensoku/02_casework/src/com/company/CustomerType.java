package com.company;

public class CustomerType {
    public String name;

    public CustomerType(String name) {
        this.name = name;
    }

    public boolean equals(CustomerType customerType){
        return customerType.name.equals(this.name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }
}
