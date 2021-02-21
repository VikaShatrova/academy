package by.academy.hw.hw3.deal;

import by.academy.hw.hw3.deal.persons.Buyer;
import by.academy.hw.hw3.deal.persons.Seller;
import by.academy.hw.hw3.deal.products.*;
import by.academy.hw.hw3.deal.products.helpers.*;


public class Application {
    public static void main(String[] args) {
        Seller seller = new Seller("Seller", "+375268962365");
        Buyer buyer = new Buyer();
        Deal deal = new Deal();
        deal.addProduct(new Dog("Dog", 100.0, 1, 5, Gender.FEMALE));
        deal.addProduct(new Cat("Cat", 150.0, 3, 8, Gender.MALE));
        deal.addProduct(new Bird("Bird", 15.0, 25, 1, Colour.RED));
        deal.goDeal(buyer, seller);
    }
}
