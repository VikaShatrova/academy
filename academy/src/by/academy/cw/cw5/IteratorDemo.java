package by.academy.cw.cw5;

public class IteratorDemo {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 5, 6, 7, 8, 9};
        Integer[] array1 = {null, null, null};
        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(array);

        while (arrayIterator.hasNext()) {
            Integer i = arrayIterator.next();
            System.out.println(i);
        }
    }
}
