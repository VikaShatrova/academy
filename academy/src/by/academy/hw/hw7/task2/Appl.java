package by.academy.hw.hw7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

public class Appl {
    public static void main(String[] args) {
        User user = new User("firstName",
                "lastName", 25,
                "dateOfBirth", "login",
                "password", "email");

        user.printUserInfo();

        Class<User> userClass = User.class;

        try {
            Class<?> personClass = Class.forName("by.academy.hw.hw7.task2.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Method userLogin = userClass.getMethod("getLogin");
            System.out.println(" userLogin \n" + userLogin);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Method[] userMethods = userClass.getMethods();
        System.out.println("user's methods: \n");
        for (Method method : userMethods) {
            System.out.println(method);
        }

        try {
            Method userPassword = userClass.getDeclaredMethod("getPassword");
            System.out.println("\nuserPassword \n" + userPassword);
        } catch (NoSuchElementException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        Method[] declaredUserMethods = userClass.getSuperclass().getDeclaredMethods();
        System.out.println("\nperson's methods: \n");
        for (Method method : declaredUserMethods) {
            System.out.println(method);
        }

        try {
            Field fieldEmail = userClass.getDeclaredField("email");
            System.out.println("\nfieldEmail \n" + fieldEmail);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        try {
            Field fieldGetEmail = userClass.getField("email");
            System.out.println("\nfieldGetEmail \n" + fieldGetEmail);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        Field[] declaredFieldsUser = userClass.getDeclaredFields();
        System.out.println("\ndeclaredFieldsUser \n");
        for (Field field : declaredFieldsUser) {
            System.out.println(field);
        }

        Field[] fieldsPerson = userClass.getSuperclass().getFields();
        System.out.println("\nfieldsPerson \n");
        for (Field field : fieldsPerson) {
            System.out.println(field);
        }

        try {
            Field fieldLogin = userClass.getDeclaredField("login");
            fieldLogin.setAccessible(true);
            fieldLogin.set(user, "testlogin");

            Field fieldPassword = userClass.getDeclaredField("password");
            fieldPassword.setAccessible(true);
            fieldPassword.set(user, "testpassword");

            Field fieldEmail = userClass.getDeclaredField("email");
            fieldEmail.setAccessible(true);
            fieldEmail.set(user, "testemail");

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Method printUserInfo = userClass.getDeclaredMethod("printUserInfo");
            Object resultValue = printUserInfo.invoke(user);
            System.out.println(resultValue);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
