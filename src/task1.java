import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        int count = 0;

        while (true) {
            System.out.print("Введите число A: ");
            A = sc.nextInt();

            System.out.print("Введите число B: ");
            B = sc.nextInt();

            if (A < B) {
                break;
            } else {
                System.out.println("A должен быть меньше B.");
            }
        }

        for (int i = A; i <= B; i++) {
            System.out.println(i + " ");
            count++;
        }


        System.out.println("\nКоличество чисел: " + count);
    }
}
