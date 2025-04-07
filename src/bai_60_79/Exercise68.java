package bai_60_79;

import java.util.Scanner;

/**
 * Bài 68: Tính S(x, n) = -x^2 + x^4  + … + (-1)^n * x^2n
 */
public class Exercise68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập vào x: ");
        double x = scanner.nextDouble();

        System.out.println("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double term = Math.pow(x, i * 2);
            if (i % 2 == 1) {
                sum -= term;
            } else {
                sum += term;
            }
        }
        System.out.println("S(" + x + "," + n + ") = " + sum);
        scanner.close();
    }
}
