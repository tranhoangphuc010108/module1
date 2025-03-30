package bai_20_39;

import java.util.Scanner;

/**
 * Bài 30: Cho số nguyên dương n. Kiểm tra xem n có phải là số hoàn thiện hay không
 */
public class Exercise30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (isPerfectNumber(n)) {
            System.out.println(n + " là số hoàn thiện.");
        } else {
            System.out.println(n + " không phải là số hoàn thiện.");
        }

        scanner.close();
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
