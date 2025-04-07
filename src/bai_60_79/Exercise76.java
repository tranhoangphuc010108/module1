package bai_60_79;

import java.util.Scanner;

/**
 * Bài 76: Kiểm tra số nguyên 4 byte có dạng 3^k hay không
 */
public class Exercise76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyeen n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Nhập vào số nguyên n(n>0)");
        } else {
            while (n % 3 == 0) {
                n /= 3;
            }

            if (n == 1) {
                System.out.println("Số là lũy thừa của 3");
            } else {
                System.out.println("Số không phải là lũy thừa của 3");
            }
        }
        scanner.close();
    }
}
