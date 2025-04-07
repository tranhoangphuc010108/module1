package bai_60_79;

import java.util.Scanner;

/**
 * Bài 73: Tính S(x, n) = -1 + x^2/2! – x^4/4! + … + (-1)^n+1 * x^2n/(2n)!
 */
public class Exercise73 {
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
            sum += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial;
        }
        System.out.println("Tổng S(" + n + "," + x + ")=" + sum);
        scanner.close();
    }
}