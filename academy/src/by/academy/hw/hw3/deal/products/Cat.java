package by.academy.hw.hw3.deal.products;

import by.academy.hw.hw3.deal.Product;
import by.academy.hw.hw3.deal.products.helpers.Gender;

public class Cat extends Product {
    private Integer age;
    private Gender gender;

    public Cat() {
        super();
    }

    public Cat(String name, Double price,
               Integer quantity, Integer age,
               Gender gender) {
        super(name, price, quantity);
        this.age = age;
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double discount() {
        double discount = 0;
        if (age > 2) {
            discount = 0.8;
        } else {
            discount = 1;
        }
        return discount;
    }
}
