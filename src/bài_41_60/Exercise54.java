package bài_41_60;

import java.util.Scanner;

/**
 * Bài 54: Hãy đếm số lượng chữ số nhỏ nhất của số nguyên dương n
 */
public class Exercise54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            int minDigit = 9;
            int count = 0;
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit < minDigit) {
                    minDigit = digit;
                }
                temp /= 10;
            }

            temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == minDigit) {
                    count++;
                }
                temp /= 10;
            }

            System.out.println("Chữ số nhỏ nhất trong " + n + " là: " + minDigit);
            System.out.println("Số lần xuất hiện của " + minDigit + " là: " + count);
        }

        scanner.close();
    }

}
