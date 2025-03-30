package bai_20_39;

import java.util.Scanner;

/**
 * Bài 38: Tính S(n) = CanBac N + 1(N + CanBac N(N – 1 +…+CanBac3(2 + CanBac2(1)))) có n dấu căn
 */
public class Exercise38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào số nguyên dương n (n >= 2): ");
            n = scanner.nextInt();
            if (n < 2) {
                System.out.println("Nhập vào số nguyên dương n (n >= 2). Vui lòng nhập lại!!");
            }
        } while (n < 2);

        double result = 1.0;

        for (int i = 2; i <= n; i++) {
            result = Math.pow(i + result, 1.0 / i);
        }
        result = Math.pow(n + result, 1.0 / (n + 1));
        System.out.printf("Giá trị của S(%d) là: %.6f\n", n, result);


        scanner.close();
    }
}
