package bài_41_60;

import java.util.Scanner;

/**
 * Bài 53: Hãy đếm số lượng chữ số lớn nhất của số nguyên dương n
 */
public class Exercise53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            int maxDigit = 0;
            int count = 0;
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                temp /= 10;
            }

            temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == maxDigit) {
                    count++;
                }
                temp /= 10;
            }

            System.out.println("Chữ số lớn nhất trong " + n + " là: " + maxDigit);
            System.out.println("Số lần xuất hiện của " + maxDigit + " là: " + count);
        }

        scanner.close();
    }
}