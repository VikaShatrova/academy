package by.academy.cw.cw2.arrays;

import java.util.Arrays;

public class Task6 {
//    Создайте массив из 4 случайных целых чисел из отрезка [10;99],
//выведите его на экран в строку.
// Определить и вывести на экран сообщение о том, является ли
// массив строго возрастающей последовательностью.

    public static void main(String[] args) {
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 1);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int a = 1; a < array.length; a++) {
                for (int b = 2; b < array.length; b++) {
                    for (int c = 3; c < array.length; c++) {
                        if (array[i] < array[a] && array[a] < array[b] && array[b] < array[c]) {
                            System.out.println("Массив является строго возрастающей последовательностью");
                        }
                    }
                }
            }
        }
    }
}
