package bai_60_79;

import java.util.Scanner;

/**
 * Bài 78: Liệt kê tất cả các ước số của số nguyên dương n
 */
public class Exercise78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.println("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Nhập vào số nguyên dương n(n > 0)");
            }
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
