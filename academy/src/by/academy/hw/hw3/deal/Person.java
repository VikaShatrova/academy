package by.academy.hw.hw3.deal;

public class Person {
    protected String name;
    protected String phone;
    protected String email;
    protected Double money;
    protected String dateOfBirth;

    protected Person() {
        super();
    }

    protected Person(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    protected Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    protected Person(String name, String phone,
                  String email, Double money,
                  String dateOfBirth) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.money = money;
        this.dateOfBirth = dateOfBirth;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected Double getMoney() {
        return money;
    }

    protected void setMoney(Double money) {
        this.money = money;
    }

    protected String getDateOfBirth() {
        return dateOfBirth;
    }

    protected void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
