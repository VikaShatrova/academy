package by.academy.hw.hw6;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("textForTask2"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("resultForTask2.txt"));

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replaceAll("\\s", ""));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            writer.close();
            reader.close();
        }
    }
}
