package bai_60_79;

import java.util.Scanner;

/**
 * Bài 69: Tính S(x, n) = x – x^3 + x^5 + … + (-1)^n * x^2n+1
 */
public class Exercise69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào x: ");
        double x = scanner.nextDouble();

        System.out.println("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        double sum = x;
        for (int i = 2; i <= n; i++) {
            double term = Math.pow(x, i * 2 + 1);
            if (i % 2 == 1) {
                sum -= term;
            } else {
                sum += term;
            }
        }
        System.out.println("S(" + x + "," + n + ") = ");
        scanner.close();
    }
}
