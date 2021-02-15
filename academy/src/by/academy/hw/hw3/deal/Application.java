package by.academy.hw.hw3.deal;

import by.academy.hw.hw3.deal.products.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Seller seller = new Seller("Seller", "+375268962365");
        Buyer buyer = new Buyer();

        Deal deal = new Deal();
        deal.inputDealDate();
        deal.addProduct(new Dog("Dog", 100.0, 1, 5, Gender.FEMALE));
        deal.addProduct(new Cat("Cat", 150.0, 3, 8, Gender.MALE));
        deal.addProduct(new Bird("Bird", 15.0, 25, 1, Colour.RED));

        Scanner scanner = new Scanner(System.in);
        buyer.inputDataBuyer();
        System.out.println("input buyer's money ");
        buyer.setMoney(scanner.nextDouble());

        if (buyer.getMoney() - deal.totalSum() < 0) {
            System.out.println("not enought money");
        } else {
            seller.showDataSeller();
            deal.deal();
            buyer.showDataBuyer();
            System.out.println("Rest of the buyer's money: " + (buyer.getMoney() - deal.totalSum()));
        }
    }
}
