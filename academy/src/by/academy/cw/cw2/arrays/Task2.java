package by.academy.cw.cw2.arrays;

public class Task2 {
//    Создайте массив из всех нечётных чисел от 1 до 99,
//выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

    public static void main(String[] args) {
        int counter = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        int[] array = new int[counter];
        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i <= 99; i++) {
                if (i % 2 != 0) {
                    array[j] = i;
                    j++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
