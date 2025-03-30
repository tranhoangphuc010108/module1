package bài_1_20;

import java.util.Scanner;

/**
 * Bài 6: Tính S(n) = 1/1×2 + 1/2×3 +…+ 1/n x (n + 1)
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào só nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Vui lòng nhập số nguyên dương lớn hơn 0!");
            }
        } while (n <= 0);

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * (i + 1));
        }
        System.out.println("Tổng S(n) = " + sum);

        scanner.close();
    }
}
