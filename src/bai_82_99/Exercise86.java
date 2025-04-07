package bai_82_99;

import java.util.Scanner;

/**
 * Bài 86: Tính S(n) = 1^3 + 2^3 + … + N^3
 */
public class Exercise86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NHập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương n > 0.");
        } else {
            long sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += Math.pow(i,3);
            }
            System.out.println("Tổng S(" + n + ") = " + sum);
        }

        scanner.close();
    }
}
