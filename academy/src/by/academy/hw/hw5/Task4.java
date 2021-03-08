package by.academy.hw.hw5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        System.out.println("Marks:");
        for (int i = 0; i < 20; i++) {
            int mark = (int) (Math.random() * 10 + 1);
            marks.add(mark);
            System.out.print(mark + " ");
        }

        Iterator<Integer> iterator = marks.iterator();
        Integer maxMark = 0;
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (maxMark < i) {
                maxMark = i;
            }
        }
        System.out.println("\nMax mark is " + maxMark);
    }
}
