package by.academy.cw.cw1;


public class Cat {
    int age;
    String nickname;
    double money;
    char initials;
    boolean isHomeAnimal;

    public Cat() {
    }

    public Cat(String nickname) {
        this.nickname = nickname;

    }

    public void grow() {
        age++;
    }

    public void sleep() {
        System.out.println(nickname + " is sleeping");
    }

    public void eat() {
        System.out.println(nickname + " is eating");
    }

    public void walk() {
        System.out.println(nickname + " is walking");
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = nickname.charAt(0);
    }

    public boolean IsHomeAnimal() {
        return isHomeAnimal;
    }

    public void setIsHomeAnimal(boolean isHomeAnimal) {
        this.isHomeAnimal = isHomeAnimal;
    }


}
