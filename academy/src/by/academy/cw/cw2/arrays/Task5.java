package by.academy.cw.cw2.arrays;

import java.util.Arrays;

public class Task5 {
//    Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
//выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
// каждого массива и сообщите,
//для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];
        double sumOne = 0;
        double sumTwo = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * 10 - 5);
            if (arrayOne[i] == 0) {
                arrayOne[i]++;
            } else if (arrayOne[i] <= 0) {
                arrayOne[i] *= -1;
            }
            sumOne += arrayOne[i];
        }
        double averageOne = sumOne / arrayOne.length;
        System.out.println(Arrays.toString(arrayOne));

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = (int) (Math.random() * 10 - 5);
            if (arrayTwo[i] == 0) {
                arrayTwo[i]++;
            } else if (arrayTwo[i] <= 0) {
                arrayTwo[i] *= -1;
            }
            sumTwo += arrayTwo[i];
        }
        double averageTwo = sumTwo / arrayTwo.length;

        System.out.println(Arrays.toString(arrayTwo));
        System.out.println("Среднее арифметическое первого массива = " + averageOne);
        System.out.println("Среднее арифметическое второго массива = " + averageTwo);

        if (averageOne > averageTwo) {
            System.out.println(averageOne + " > " + averageTwo);
        } else if (averageOne == averageTwo) {
            System.out.println("Среднее арифметическое первого и второго массива равны");
        } else {
            System.out.println(averageTwo + " > " + averageOne);
        }


    }
}
