package bai_60_79;

import java.util.Scanner;

/**
 * Bài 74: Tính S(x, n) = 1 – x + x^3/3! – x^5/5! + … + (-1)^n+1 * x^2n+1/(2n + 1)!
 */
public class Exercise74 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào x:");
        double x = scanner.nextDouble();

        System.out.println("Nhập vào n:");
        int n = scanner.nextInt();

        double sum = 1;
        long factorial;

        for (int i = 1; i <= n; i++) {
            factorial = 1;
            for (int j = 1; j <= 2 * i + 1; j++) {
                factorial *= j;
            }
            sum += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial;
        }
        System.out.println("Tổng S(" + n + "," + x + ")=" + sum);
        scanner.close();
    }
}
