package bài_41_60;

import java.util.Scanner;

/**
 * Bài 52: Tìm chữ số nhỏ nhất của số nguyên dương n
 */
public class Exercise52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            int minDigit = 9;
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit < minDigit) {
                    minDigit = digit;
                }
                temp /= 10;
            }

            System.out.println("Chữ số bé nhất trong " + n + " là: " + minDigit);
        }
    }
}
