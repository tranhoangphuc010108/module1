package bai_60_79;

import java.util.Scanner;

/**
 * Bài 71: Tính S(x, n) = -x + x^2/(1 + 2) – x^3/(1 + 2 + 3) + … + (-1)^n * x^n/(1 + 2 +… + n)
 */
public class Exercise70 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào x:");
        double x = scanner.nextDouble();

        System.out.println("Nhập vào n:");
        int n = scanner.nextInt();

        double sum = 0;
        int sumOfNumbers = 0;

        for (int i = 1; i <= n; i++) {
            sumOfNumbers += i;
            sum += Math.pow(-1, i) * Math.pow(x, i) / sumOfNumbers;
        }
        System.out.println("Tổng S(" + n + "," + x + ")=" + sum);
        scanner.close();
    }
}