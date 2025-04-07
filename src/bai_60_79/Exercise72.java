package bai_60_79;

import java.util.Scanner;

/**
 * Bài 72: Tính S(x, n) = – x + x^2/2! – x^3/3! + … + (-1)^n * x^n/n!
 */
public class Exercise72 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào x:");
        double x = scanner.nextDouble();

        System.out.println("Nhập vào n:");
        int n = scanner.nextInt();

        double sum = 0;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += Math.pow(-1, i) * Math.pow(x, i) / factorial;

        }
        System.out.println("Tổng S(" + n + "," + x + ")=" + sum);
        scanner.close();
    }
}