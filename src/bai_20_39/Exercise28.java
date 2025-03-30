package bai_20_39;

import java.util.Scanner;

/**
 * Bài 28: Cho số nguyên dương n. Tính tổng các ước số nhỏ hơn chính nó
 */
public class Exercise28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Nhập vào số nguyên dương n(n>0). xin nhập lại!");
        } else {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            System.out.println("tổng các ước số nhỏ hơn " + n + " là " + sum);
        }
        scanner.close();
    }
}
