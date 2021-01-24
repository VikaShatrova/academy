package by.academy.cw.cw2;

public class Task30 {
//    С помощью оператора while
//    напишите программу определения суммы всех нечетных чисел
//    в диапазоне от 1 до 99 включительно.

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}


