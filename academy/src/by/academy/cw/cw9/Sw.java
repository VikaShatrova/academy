package by.academy.cw.cw9;

public class Sw {
    public static void main(String[] args) {
        Days days = Days.MON;
        switch (days) {
            case MON:
                System.out.println("MON");
                break;
            case TU:
                System.out.println("TU");
                break;
            case WEN:
                System.out.println("WEN");
                break;
            case FR:
                System.out.println("FR");
                break;
            case SAT:
                System.out.println("SAT");
                break;
            case SUN:
                System.out.println("SUN");
                break;
            default:
                System.out.println("error");
        }
    }
}
