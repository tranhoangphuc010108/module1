package bài_1_20;

import java.util.Scanner;

/**
 * Bài 17: Tính S(n) = x + x^2/2! + x^3/3! + … + x^n/N!
 */
public class Exercise17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        double x;

        System.out.print("Nhập giá trị x: ");
        x = scanner.nextDouble();

        do {
            System.out.print("Nhập vào số nguyên dương n(n>0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Nhập vào số nguyên dương n(n>0). vui lòng nhập lại: ");
            }
        } while (n <= 0);

        double sum = 0;
        long denominator = 1;
        for (int i = 1; i <= n; i++) {
            denominator *= i;
            sum += Math.pow(x, i) / denominator; // lũy thừa:x^i
        }
        System.out.println(" S(n) = " + sum);
        scanner.close();
    }
}