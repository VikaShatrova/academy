package by.academy.cw.cw2.loops;

public class Task24 {
    //     Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)

    public static void main(String[] args) {
        int sum = 0;
        long product = 1;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            product *= sum;
        }
        System.out.println(product);
    }
}

