package bài_1_20;

import java.util.Scanner;

/**
 * Bài 7: Tính S(n) = ½ + 2/3 + ¾ + …. + n / n + 1
 */
public class Exercise7 {
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

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += i / (i + 1.0);
        }
        System.out.println("Tổng S(n) = " + sum);

        scanner.close();
    }
}
