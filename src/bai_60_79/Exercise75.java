package bai_60_79;

import java.util.Scanner;

/**
 * Bài 75: Kiểm tra số nguyên 4 byte có dạng 2^k hay không
 */
public class Exercise75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một số nguyên:");
        int n = scanner.nextInt();

        while (n % 2 == 0 && n > 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println(n + " là lũy thừa của 2.");
        } else {
            System.out.println(n + " không phải là lũy thừa của 2.");
        }

        scanner.close();
    }
}
