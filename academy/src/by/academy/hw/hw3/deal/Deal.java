package by.academy.hw.hw3.deal;

import by.academy.hw.hw3.deal.persons.Buyer;
import by.academy.hw.hw3.deal.persons.Seller;
import by.academy.hw.hw3.deal.products.*;
import by.academy.hw.hw3.deal.products.helpers.Colour;
import by.academy.hw.hw3.deal.products.helpers.Gender;
import by.academy.hw.hw3.deal.validate.DateValidator;

import java.time.LocalDate;
import java.util.Scanner;

public class Deal {

    public final static int DEFAULT_SIZE = 2;

    public String dealDate;
    private Person seller;
    private Person buyer;
    private Product[] products;
    private int productCounter;

    public Deal() {
        super();
    }

    public Deal(Person seller, Person buyer,
                Product[] products) {
        super();
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public void goDeal(Buyer buyer, Seller seller) {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        switch (number) {
            case "1":
                System.out.println("list of products:");
                addProduct(new Dog("Dog", 100.0, 1, 5, Gender.FEMALE));
                addProduct(new Cat("Cat", 150.0, 3, 8, Gender.MALE));
                addProduct(new Bird("Bird", 15.0, 25, 1, Colour.RED));
                printListOfProducts();
                System.out.println();
                goDeal(buyer, seller);
                break;
            case "2":
                buyer.inputDataBuyer();
                inputDealDate();
                if (buyer.getMoney() - totalSum() < 0) {
                    System.out.println("not enought money");
                } else {
                    seller.showDataSeller();
                    deal();
                    buyer.showDataBuyer();
                    System.out.println("Rest of the buyer's money: " + (buyer.getMoney() - totalSum()));
                }
                System.out.println();
                goDeal(buyer, seller);
                break;
            case "3":
                return;
        }
    }

    public void printMenu() {
        System.out.println("Menu");
        System.out.println("____________");
        System.out.println("input number: ");
        System.out.println("1. list of products");
        System.out.println("2. deal");
        System.out.println("3. exit");
    }

    public void printListOfProducts() {
        for (Product p : products) {
            if (p != null) {
                System.out.println("_________________");
                System.out.println("product: " + p.getName() + "\n price: " + p.getPrice());
            }
        }
    }

    public void addProduct(Product product) {
        if (products == null) {
            products = new Product[DEFAULT_SIZE];
        } else {
            if (productCounter + 1 > products.length) {
                expandProductArray();
            }
        }
        products[productCounter++] = product;
    }

    private void expandProductArray() {
        Product[] tempArray = new Product[products.length * 2 + 1];
        System.arraycopy(products, 0, tempArray, 0, products.length);
        products = tempArray;
    }

    public void deal() {
        System.out.println();
        System.out.println("DEAL!!!!");
        printBill();
    }

    public double printBill() {
        System.out.println("BILL of " + dealDate);
        System.out.println("Deadline date: " + "\nDay: " + printDeadlineDate().getDayOfMonth());
        System.out.println("Month: " + printDeadlineDate().getMonth());
        System.out.println("Year: " + printDeadlineDate().getYear());
        double checkSum = 0.0;
        for (Product p : products) {
            if (p != null) {
                System.out.println("_________________");
                System.out.println("product: " + p.getName());
                System.out.println(p.getPrice() + " x " + p.getQuantity() + " x " + p.discount()
                        + " = " + p.calcFinalPrice());
                checkSum += p.calcFinalPrice();
            }
        }
        System.out.println("_________________");
        System.out.println("TOTAL SUM = " + checkSum);
        return checkSum;
    }

    public double totalSum() {
        double totalSum = 0.0;
        for (Product p : products) {
            if (p != null) {
                totalSum += p.calcFinalPrice();
            }
        }
        return totalSum;
    }

    public void inputDealDate() {
        System.out.println("input deal's date (format dd/MM/yyyy)");
        Scanner scan = new Scanner(System.in);
        setDealDate(scan.nextLine());
        DateValidator dealDate = new DateValidator();
        dealDate.validate(this.dealDate);
    }

    public LocalDate printDeadlineDate() {
        LocalDate today = LocalDate.now();
        LocalDate deadlineDate = today.plusDays(10);
        return deadlineDate;
    }
}

