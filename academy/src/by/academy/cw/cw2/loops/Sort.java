package by.academy.cw.cw2.loops;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {5, 6, 8, 2, 4};
        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array.length-1; n++)
                if (array[i] < array[n]) {
                    int temp = array[i];
                    array[i] = array[n];
                    array[n] = temp;
                }
        }
        System.out.println(Arrays.toString(array));
    }
}
