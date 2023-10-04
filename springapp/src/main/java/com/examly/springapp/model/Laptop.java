package com.examly.springapp.model;

public class Laptop {
    private int laptopId;
    private String laptopBrand;
    private int laptopPrice;

    public Laptop() {
    }

    public Laptop(int laptopId, String laptopBrand, int laptopPrice) {
        this.laptopId = laptopId;
        this.laptopBrand = laptopBrand;
        this.laptopPrice = laptopPrice;
    }

    // Getters and setters for the attributes
}
