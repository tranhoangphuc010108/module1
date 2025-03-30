package bài_1_20;

import java.util.Scanner;

/**
 * Bài 9: Tính T(n) = 1 x 2 x 3…x N
 */
public class Exercise9 {
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

       int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        System.out.println("Tổng S(n) = " + product);

        scanner.close();
    }
}
