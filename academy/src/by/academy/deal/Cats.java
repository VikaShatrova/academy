package by.academy.deal;

public class Cats extends Product {
    Integer age;
    String gender;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public double discount() {
        double discount = 0;
        if (age > 8) {
            discount = 0.8;
        } else {
            discount = 1;
        }
        return discount;
    }

    public Cats() {
        super();
    }
}
