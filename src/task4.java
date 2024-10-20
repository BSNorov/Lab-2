import java.util.Scanner;

public class task4 {
    public static double calcPowerSum(int A) {
        double powThree = Math.pow(A, 3);
        double powFive = Math.pow(A, 5);
        double powSeven = Math.pow(A, 7);

        return powThree + powFive + powSeven;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;

        System.out.print("Введите число A: ");
        A = sc.nextInt();

        double result = calcPowerSum(A);
        System.out.println( A + "^3 + " + A + "^5 + " + A + "^7 = " + result);
        sc.close();
    }

}

