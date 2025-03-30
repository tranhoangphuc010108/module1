package bai_20_39;

import java.util.Scanner;

/**
 * Bài 27: Đếm số lượng “ước số chẵn” của số nguyên dương n
 */
public class Exercise27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Nhập vào số nguyên dương n(n>0). xin nhập lại!!!");
        } else {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("số lượng “ước số chẵn” của " + n + " là: " + count);
        }
        scanner.close();
    }
}
