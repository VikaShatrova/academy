package by.academy.cw.cw1;

import by.academy.cw.cw1.Cat;

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
