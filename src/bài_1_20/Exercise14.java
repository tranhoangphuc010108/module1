package bài_1_20;

import java.util.Scanner;

/**
 * Bài 14: Tính S(n) = x + x^3 + x^5 + … + x^2n + 1
 */
public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, x;
        System.out.println("Nhập vào x: ");
        x = scanner.nextInt();
        do {
            System.out.print("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Vui lòng nhập số nguyên dương lớn hơn 0!");
            }
        } while (n <= 0);

        int sum = 0;
        int  power  = x ;
        for (int i = 1; i <= n + 1; i++) {
            sum += power;
            power *= x * x;
        }
        System.out.println("S(n): " + sum);
        scanner.close();
    }
}
