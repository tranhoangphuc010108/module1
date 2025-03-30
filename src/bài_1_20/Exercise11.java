package bài_1_20;

import java.util.Scanner;

/**
 * Bài 11: Tính S(n) = 1 + 1.2 + 1.2.3 + … + 1.2.3….N
 */
public class Exercise11 {
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

        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
         factorial *= i;
         sum += factorial;
        }
        System.out.println("S(n): " + sum);
        scanner.close();
    }
}
