package by.academy.deal;

public class Deal {
    Person seller;
    Person buyer;
    Product [] products;
    String dealDate;

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }
}
