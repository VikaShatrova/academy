package by.academy.deal;

public class Birds extends Product {
    Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double discount() {
        double discount = 0;
        if (quantity > 20) {
            discount = 0.9;
        } else {
            discount = 1;
        }
        return discount;
    }

    public Birds() {
        super();
    }
}
