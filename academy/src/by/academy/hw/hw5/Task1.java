package by.academy.hw.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Task1 {
    public static <T> Collection<T> clearCollection(Collection<T> collection) {
        return new HashSet<T>(collection);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "1", "1", "a", "b", "ab", "a", "b"));
        System.out.println("before: " + list);
        System.out.println("after: " + clearCollection(list));
    }
}
