package by.academy.hw.hw3.deal;

public class Seller extends Person {

    public Seller() {
        super();
    }

    public Seller(String name, Double money) {
        super(name, money);
    }

    public Seller(String name, String phone) {
        super(name, phone);
    }

    public Seller(String name, String phone,
                  String email, Double money,
                  String dateOfBirth) {
        super(name, phone, email, money, dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void showDataSeller() {
        System.out.println();
        System.out.println("seller's name: " + getName());
        System.out.println("seller's phone: " + getPhone());
        System.out.println("_________________");
    }

}
