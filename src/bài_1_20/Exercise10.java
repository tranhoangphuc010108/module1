package bài_1_20;

import java.util.Scanner;

/**
 * Bài 10: Tính T(x, n) = x^n
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, n;

        do {
            System.out.println("Nhập vào x(với x khác 0): ");
            x = scanner.nextInt();
            if (x == 0) {
                System.out.println("x khác 0. vui lòng nhập lại: ");
            }
        } while (x == 0);


        System.out.println("Nhập vào  n: ");
        n = scanner.nextInt();

// X * X * X

        double result = 1; //Math.pow(x, n) là phương thức tính lũy thừa x^n của Java

        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                result *= x;
            }
            result = 1.0 / result;
        } else {
            for (int i = 0; i < n; i++) {
                result *= x; // x * x * x
            }
        }
        System.out.println(" T(x, n) = " + result);
        scanner.close();
    }
}