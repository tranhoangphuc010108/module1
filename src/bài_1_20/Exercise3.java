package bài_1_20;

import java.util.Scanner;

/**
 * Bài 3: Tính S(n) = 1 + ½ + 1/3 + … + 1/n
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Nhập vào số nguyên dương n>o, xin nhập lại");
            }
        } while (n <= 0);
       double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Tổng S(n) = " + sum);

        scanner.close();
    }
}
