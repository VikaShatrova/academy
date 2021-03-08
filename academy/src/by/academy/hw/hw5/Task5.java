package by.academy.hw.hw5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String text = "ох как сложно делать домашку 8го марта, " +
                "надо было конечно раньше сделать, но тогда было много работы " +
                "не судите строго";
        System.out.println(text);

        char[] ch = text.replaceAll("\\s", "").toCharArray();

        for (Character c : ch) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        System.out.println(map);
    }
}
