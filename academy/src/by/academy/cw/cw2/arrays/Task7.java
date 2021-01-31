package by.academy.cw.cw2.arrays;

public class Task7 {
    //    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
//Напоминаем, что первый и второй члены последовательности равны единицам,
// а каждый следующий — сумме двух предыдущих.

    public static void main(String[] args) {
        int[] array = new int[19];
        array[0] = 1;
        array[1] = 1;
        System.out.print(array[0] + " " + array[1] + " ");
        for (int i = 2; i <= array.length; i++) {
            array[2] = array[1] + array[0];
            System.out.print(array[2] + " ");
            array[0] = array[1];
            array[1] = array[2];
        }
    }
}