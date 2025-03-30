package bai_20_39;

import java.util.Scanner;

/**
 * Bài 26: Tính tích tất cả các “ước số lẻ” của số nguyên dương n
 */
public class Exercise26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.print("Nhập vào số nguyên dương n(n>0). xin nhập lại!! ");
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i % 2 != 0) {
                    product *= i;

                }
            }
            System.out.println("Tích tất cả các số nguyên dương lẻ của" + n + " ước là:" + product);
        }
        scanner.close();
    }
}
