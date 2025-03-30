package bài_1_20;

import java.util.Scanner;

/**
 * Bài 18: Tính S(n) = 1 + x^2/2! + x^4/4! + … + x^2n/(2n)!
 */
public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Nhập vào x: ");
        double x = scanner.nextDouble();

        do {
            System.out.print("Nhập vào số nguyên dương n(n>0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số nguyên dương!");
            }
        } while (n <= 0);

        // Khởi tạo tổng
        double sum = 1.0;

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            int exponent = 2 * i;
            factorial *= (2 * i - 1) * (2 * i);
            sum += Math.pow(x, exponent) / factorial; // Cộng vào tổng
        }

        // In kết quả
        System.out.println("S(n) = " + sum);
        scanner.close();
    }
}