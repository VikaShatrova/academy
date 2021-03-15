package by.academy.hw.hw6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        final String stopString = "OK";
        String text;

        Scanner scanner = new Scanner(System.in);
        FileWriter writer = new FileWriter("scanText.txt");

        System.out.println("input text");
        try {
            do {
                text = scanner.next();
                writer.write(text + " ");
            } while (!text.equals(stopString));

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            writer.close();
            scanner.close();
        }
    }
}
