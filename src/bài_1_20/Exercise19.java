package bài_1_20;

import java.util.Scanner;

/**
 * Bài 19: Tính S(n) = 1 + x + x^3/3! + x^5/5! + … + x^(2n+1)/(2n+1)!
 */
public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Nhập vào x: ");
        double x = scanner.nextDouble();

        do {
            System.out.print("Nhập vào số nguyên dương n(n>0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số nguyên dương!");
            }
        } while (n <= 0);

        // Khởi tạo tổng
        double sum = 1.0 + x;
        long factorial = 1;
        double power = x;
        for (int i = 1; i <= n; i++) {      // Cộng vào tổng
          power *= x * x;
          factorial *= (2 * i + 1) * (2 * i);
          sum += power / factorial;
        } // x^(2n+1)/(2n+1)!
        /*
        1 + x + x^3/3!
        )
        n = 0 => x
        n = 1 => x^3/3!

         */

        // In kết quả
        System.out.println("S(n) = " + sum);
        scanner.close();
    }
}