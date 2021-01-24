package by.academy.cw.cw2;

public class Task19 {
//    Два двузначных числа, записанных одно за другим ,
//    образуют четырёхзначное число, которое делится на их произведение. Найти эти числа.

    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                if ((i * 100 + j) % (i * j) == 0) {
                    System.out.println("число i: " + i + " число j: " + j);
                }
            }
        }
    }
}
