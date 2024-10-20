import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение ε: ");
        double epsilon = sc.nextDouble();

        if (epsilon <= 0) {
            System.out.print("ε должна быть больше 0");
            return;
        }

        double A1 = 1;
        double A2 = 2;
        double previous = A2;
        double current = 0;
        int K = 3;

        while (true) {
            current = (A1 + 2 * previous) / 3;

            if (Math.abs(current - previous) < epsilon) {
                System.out.println("Первый номер K: " + K);
                System.out.println("A_" + (K - 1) + " = " + previous);
                System.out.println("A_" + K + " = " + current);
                break;
            }
            A1 = previous;
            previous = current;
            K++;
        }

        sc.close();
    }

}

