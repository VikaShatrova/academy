package by.academy.hw.hw7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    private static List<Long> generateLongList(int seed, int size) {
        Supplier<Long> supplier = () -> (long) new Random().nextInt(seed + 1);
        return Stream.generate(supplier)
                .limit(size)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Long> listForTask1 = generateLongList(100, 100);

        System.out.println(listForTask1.stream()
                .map(x -> (x * Math.PI - 20))
                .filter(x -> x < 100)
                .sorted()
                .skip(3)
                .distinct()
                .collect(Collectors.toMap(x -> x, x -> (" Number: " + x))));
    }
}
