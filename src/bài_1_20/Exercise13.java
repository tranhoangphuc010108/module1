package bài_1_20;

import java.util.Scanner;

/**
 * Bài 13: Tính S(n) = x^2 + x^4 + … + x^2n
 */
public class Exercise13 {
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
        int  power  = x * x;
        for (int i = 1; i <= n; i++) {
            sum +=  power;
            power  *= x * x;
        }
        System.out.println("S(n): " + sum);
        scanner.close();
    }
}
