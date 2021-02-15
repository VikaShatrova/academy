package by.academy.hw.hw3.deal;

public class Person {
    protected String name;
    protected String phone;
    protected String email;
    protected Double money;
    protected String dateOfBirth;

    public Person() {
        super();
    }

    public Person(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Person(String name, String phone,
                  String email, Double money,
                  String dateOfBirth) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.money = money;
        this.dateOfBirth = dateOfBirth;
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
}
