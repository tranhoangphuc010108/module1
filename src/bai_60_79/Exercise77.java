package bai_60_79;

import java.util.Scanner;

/**
 * Bài 77: Viết chương trình tính tổng của dãy số sau: S(n) = 1 + 2 + 3 + … + n
 */
public class Exercise77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui vòng nhập vào số nguyên dương n xin nhập lại: ");
            }
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng S(n) = " + sum);
        scanner.close();
    }
}
