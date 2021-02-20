package by.academy.hw.hw3.deal.products;

import by.academy.hw.hw3.deal.Product;
import by.academy.hw.hw3.deal.products.helpers.Gender;
import by.academy.hw.hw3.deal.products.helpers.Producer;

@Producer(birthYear = 2018, country = "Belarus", kind = "German shepherd")
public class Dog extends Product {
    private Integer age;
    private Gender gender;

    public Dog() {
        super();
    }

    public Dog(String name, Double price,
               Integer quantity, Integer age, Gender gender) {
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
        if (gender == Gender.FEMALE) {
            discount = 0.83;
        } else {
            discount = 1;
        }
        return discount;
    }
}
