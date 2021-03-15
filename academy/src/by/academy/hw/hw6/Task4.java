package by.academy.hw.hw6;

import java.io.*;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        File dir = new File("task4");
        if (!dir.exists()) {
            dir.mkdir();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("resultForTask2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            File files = new File(dir, i + ".txt");

            BufferedWriter writer = new BufferedWriter(new FileWriter(files));
            try {
                writer.write(sb.substring(0, random.nextInt(sb.length())));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                writer.close();
            }
        }

        File file = new File("resultForTask4.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (File f : dir.listFiles()) {
                writer.append("\nname: " + f.getName() + "\nsize: " + f.length());
            }
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

