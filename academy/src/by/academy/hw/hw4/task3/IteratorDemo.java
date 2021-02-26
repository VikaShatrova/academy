package by.academy.hw.hw4.task3;

public class IteratorDemo {
    public static void main(String[] args) {
        Integer[][] array = {{1, 2, 3, 5, 6, 7, 8, 9}, {10, 11, 12}};
        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(array);

        while (arrayIterator.hasNext()) {
            Integer i = arrayIterator.next();
            System.out.print(i + " ");
        }
    }
}
