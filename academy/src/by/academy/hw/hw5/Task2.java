package by.academy.hw.hw5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(random.nextInt());
            linkedList.add(random.nextInt());
        }

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.get(random.nextInt(100_000));
        }
        System.out.println("ArrayList is completed");

        for (int i = 0; i < 1_000_000; i++) {
            linkedList.get(random.nextInt(100_000));
        }
        System.out.println("LinkedList is completed");
    }
}
