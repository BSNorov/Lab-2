import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число N (> 0): ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("N должно быть больше 0");
            return;
        }

        double res = 0.0;

        for (int i = 1; i <= N; i++) {
            double term = 1.0 + (i / 10.0);
            res += Math.pow(-1, i + 1) * term;
        }

        System.out.printf("Результат: %.2f%n", res);
    }
}
