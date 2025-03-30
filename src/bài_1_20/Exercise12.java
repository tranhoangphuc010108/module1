package bài_1_20;
/**
 * Bài 12: Tính S(n) = x + x^2 + x^3 + … + x^n
 */

import java.util.Scanner;

public class Exercise12 {
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
        int  power  = x;
        for (int i = 1; i <= n; i++) {
            sum +=  power ;
            power  *= x;
        }
        System.out.println("S(n): " + sum);
        scanner.close();
    }
}
