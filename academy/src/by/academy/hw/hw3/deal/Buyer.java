package by.academy.hw.hw3.deal;

import by.academy.hw.hw3.deal.validate.BelarusPhoneValidator;
import by.academy.hw.hw3.deal.validate.DateValidator;
import by.academy.hw.hw3.deal.validate.EmailValidator;

import java.util.Scanner;

public class Buyer extends Person {

    public Buyer() {
        super();
    }

    public Buyer(String name, Double money) {
        super(name, money);
    }

    public Buyer(String name, String phone,
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

    public void showDataBuyer() {
        System.out.println();
        System.out.println("buyer's name: " + getName());
        System.out.println("buyer's phone: " + getPhone());
        System.out.println("_________________");
    }

    public void inputDataBuyer() {
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.println("input buyer's phone ");
        setPhone(scan.nextLine());
        BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();
        belarusPhoneValidator.validate(phone);

        System.out.println("input buyer's email ");
        setEmail(scan.nextLine());
        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate(email);

        System.out.println("input buyer's date of birth ");
        setDateOfBirth(scan.nextLine());
        DateValidator dealDate = new DateValidator();
        dealDate.validate(dateOfBirth);
    }
}
