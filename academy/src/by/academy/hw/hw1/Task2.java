package by.academy.hw.hw1;

import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("input variable type, please");

        String type = scan.nextLine();

        switch (type) {
            case "int":
                System.out.println("input value");
                int val0 = scan.nextInt();
                System.out.println(val0 % 2);
                break;
            case "double":
                System.out.println("input value");
                double val1 = scan.nextDouble();
                System.out.println(val1 * 70 / 100);
                break;
            case "float":
                System.out.println("input value");
                float val2 = scan.nextFloat();
                System.out.println(val2 * val2);
                break;
            case "char":
                System.out.println("input value");
                int val3 = System.in.read();
                System.out.println(val3);
                break;
            case "String":
                System.out.println("input value");
                String val4 = scan.nextLine();
                System.out.println("Hello " + val4);
                break;
            default:
                System.out.println("Unsupported type");
        }
    }
}
