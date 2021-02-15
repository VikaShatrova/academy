package by.academy.hw.hw3.deal;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product() {
        super();
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    protected abstract double discount();

    protected double calcFinalPrice() {
        return price * quantity * discount();
    }
}