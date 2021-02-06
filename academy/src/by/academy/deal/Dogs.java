package by.academy.deal;

public class Dogs extends Product {
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
        if (gender.equals("f")) {
            discount = price * 0.17;
        }
        return discount;
    }

    public Dogs() {
        super();
    }
}
