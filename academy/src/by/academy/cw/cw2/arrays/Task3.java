package by.academy.cw.cw2.arrays;

import java.util.Arrays;

public class Task3 {
//    Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//Выведите массив на экран. Подсчитайте сколько в массиве чётных
// элементов и выведете это количество на экран на отдельной строке.

    public static void main(String[] args) {
        int counter = 0;
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (array[i]==0){
                array[i]++;
            }
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Количество четных элементов: " + counter);
    }
}
