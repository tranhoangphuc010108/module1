package bai_60_79;

import java.util.Scanner;

/**
 * Bài 70: Tính S(n) = 1 – 1/(1 + 2) + 1/(1 + 2 + 3)  + … + (-1)^n+1 * 1/(1 + 2 + 3+ … + n)
 */
public class Exercise71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Nhập vào số nguyên dương n(n>0). vui lòng nhập lại");
            }
        } while (n <= 0);
        double sum = 0;
        int sumOfNumbers = 0;
        for (int i = 1; i <= n; i++) {
            sumOfNumbers += i;
            sum += Math.pow(-1, i + 1) * (1.0 / sumOfNumbers);
            }

        System.out.println("S(" + n + ")=" + sum);
    }
}