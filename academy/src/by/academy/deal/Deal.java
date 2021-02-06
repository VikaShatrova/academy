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

    public double check(){

    }

    public Deal() {
        super();
    }

    public Deal(Person seller, Person buyer, Product[] products, String dealDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.dealDate = dealDate;
    }
}
