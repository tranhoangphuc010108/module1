package bài_1_20;

import java.util.Scanner;

/**
 * Bài 1: Tính S(n) = 1 + 2 + 3 + … + n
 */
public class Exercise1 {
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
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Tổng S(n) = " + sum);

        scanner.close();
    }
}
