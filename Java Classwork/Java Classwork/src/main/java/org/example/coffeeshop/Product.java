package org.example.coffeeshop;

public class Product {
    private double price;
    private String name;
    private boolean drink;

    public Product() {

    }

    public Product(double price, String name, boolean drink) {
        this.price = price;
        this.name = name;
        this.drink = drink;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }
}
