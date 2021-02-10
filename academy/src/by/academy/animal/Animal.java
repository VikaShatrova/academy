package by.academy.animal;

public abstract class Animal {
    protected abstract int age();

    protected void printAge() {
        System.out.println(age());
    }
}
