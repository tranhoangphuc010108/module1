package bài_1_20;

import java.util.Scanner;

/**
 * Bài 4: Tính S(n) = ½ + ¼ + … + 1/2n
 */
public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Nhập vào số nguyên dương n(n > 0). xin nhập lại: ");
            }
        } while (n <= 0);

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (2 * i);
        }

        System.out.println("Tổng S(n) = " + sum);

        scanner.close();
    }
}
