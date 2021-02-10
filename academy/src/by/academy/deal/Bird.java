package by.academy.deal;

public class Bird extends Product {
    Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double discount() {
        return super.discount();
    }

    public Bird() {
        super();
    }
}
