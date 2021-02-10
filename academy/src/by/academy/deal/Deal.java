package by.academy.deal;

public class Deal {
    Person seller;
    Person buyer;
    Product[] products;
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

    public double deal() {
        double checkSum = 0.0;

        for (Product p : products) {
            if (p != null) {
                System.out.println(p.getName());
                System.out.println(p.getPrice() + " x " + p.getQuantity() + " x " + p.discount()
                        + " = " + p.getPrice() * p.getQuantity() * p.discount());
                checkSum += p.discount() * p.getPrice() * p.getQuantity();
            }
        }
        return checkSum;
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
