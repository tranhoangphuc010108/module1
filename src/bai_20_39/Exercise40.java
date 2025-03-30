package bai_20_39;

import java.util.Scanner;

/**
 * Bài 40: Tính S(n) = CanBac2(x^n + CanBac2(x^n-1 + … + CanBac2(x^2 + CanBac2(x)))) có n dấu căn
 */
public class Exercise40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x;
        do {
            System.out.print("Nhập vào số nguyên dương n (n >= 1): ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("Giá trị n phải lớn hơn hoặc bằng 1. Vui lòng nhập lại!");
            }
        } while (n < 1);
        System.out.println("Nhập vào x: ");
         x = scanner.nextInt();

        double result = Math.sqrt(x);

        for (int i = 2; i <= n; i++) {
            result = Math.sqrt(Math.pow(x, i) + result);
        }
        System.out.printf("Giá trị của S[%d] với x = %d là: %.6f\n", n, x, result);
        scanner.close();
    }
}
