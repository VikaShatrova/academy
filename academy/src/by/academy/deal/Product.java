package by.academy.deal;

public class Product {
    String name;
    double price;
    Integer quantity;

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

    protected double discount() {
        double discount = 0;
        if (quantity > 20) {
            discount = 0.9;
        } else {
            discount = 1;
        }
        return discount;
    }

    public Product() {
        super();
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
