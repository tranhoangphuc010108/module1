package bai_20_39;

import java.util.Scanner;

/**
 * Bài 24: Liệt kê tất cả các “ước số lẻ” của số nguyên dương n
 */
public class Exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Nhập vào số nguyên dương n. xin nhập lại: ");
        } else {
            System.out.print("Các ước số chung của " + n + " là: ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        scanner.close();
    }
}
