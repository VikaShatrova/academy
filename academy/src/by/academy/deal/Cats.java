package by.academy.deal;

public class Cats extends Product {
    Integer age;
    String gender;

    public void grows (Integer age){
        this.age++;
    }

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

    public Cats() {
        super();
    }
}
