package by.academy.cw.cw2.arrays;

import java.util.Arrays;

public class Task4 {
//    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

    public static void main(String[] args) {
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            if (array[i] == 0) {
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
