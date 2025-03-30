package bài_41_60;
/**
 * Bài 41: Tính S(n) = 1 / (1 + 1 / ( 1 + 1 / (…. 1 + 1 / 1 + 1))) có n dấu phân số
 */

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào số nguyên dương n (n >= 1): ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("Giá trị n phải lớn hơn hoặc bằng 1. Vui lòng nhập lại!");
            }
        } while (n < 1);

        double result = 1.0; // 0,5

        for (int i = 1; i <= n; i++) { // i = 1 =>result = 1 / (1+1)
            result = 1.0 / (1 + result);
        }

        System.out.printf("Giá trị của S(%d) là: %.6f\n", n, result);

        scanner.close();
    }
}
