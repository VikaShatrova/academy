package by.academy.classwork.lesson1;

public class Application {
    public static void main(String[] args) {
        Cat noname = new Cat();
        Cat name = new Cat("Copper");
        name.eat();
        name.sleep();
        name.walk();
        noname.grow();
        noname.grow();
        noname.grow();
        System.out.println("age of noname is " + noname.age);



    }
}
