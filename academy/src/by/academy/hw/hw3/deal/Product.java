package by.academy.hw.hw3.deal;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    protected Product() {
        super();
    }

    protected Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected Integer getQuantity() {
        return quantity;
    }

    protected void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    protected abstract double discount();

    protected double calcFinalPrice() {
        return price * quantity * discount();
    }
}
