package by.academy.hw.hw3.deal;

import by.academy.hw.hw3.deal.persons.Buyer;
import by.academy.hw.hw3.deal.persons.Seller;

public class Application {
    public static void main(String[] args) {
        Seller seller = new Seller("Seller", "+375268962365");
        Buyer buyer = new Buyer();
        Deal deal = new Deal();
        deal.goDeal(buyer, seller);
    }
}
