package by.academy.hw.hw3.deal.products;

import by.academy.hw.hw3.deal.Product;
import by.academy.hw.hw3.deal.products.helpers.Colour;


public class Bird extends Product {
    private Integer age;
    private Colour colour;

    public Bird() {
        super();
    }

    public Bird(String name, Double price,
                Integer quantity, Integer age,
                Colour colour) {
        super(name, price, quantity);
        this.age = age;
        this.colour = colour;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public double discount() {
        double discount = 0;
        if (quantity > 10) {
            discount = 0.9;
        } else {
            discount = 1;
        }
        return discount;
    }
}
