package bai_20_39;

import java.util.Scanner;

/**
 * Bài 25: Tính tổng tất cả các “ước số chẵn” của số nguyên dương n
 */
public class Exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.print("Nhập vào số nguyên dương n(n>0). xin nhập lại!! ");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i % 2 == 0) {
                    sum += i;

                }
            }
            System.out.println("Tổng tất cả các số nguyên dương chẵn của" + n + " ước là:" + sum);
        }
        scanner.close();
    }
}
