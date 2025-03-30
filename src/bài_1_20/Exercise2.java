package bài_1_20;

import java.util.Scanner;

/**
 * Bài 2: Tính S(n) = 1^2 + 2^2 + … + n^2
 * Format code: Ctrl + Alt + L
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Vui lòng nhập số nguyên dương lớn hơn 0!");
            }
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i * i;
        }
        System.out.println("Tổng S(n) = " + sum);

        scanner.close();
    }
}