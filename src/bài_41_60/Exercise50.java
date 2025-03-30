package bài_41_60;

import java.util.Scanner;

/**
 * Bài 50: Hãy tìm số đảo ngược của số nguyên dương n
 */
public class Exercise50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            int reverse = 0;
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }

            System.out.println("Số đảo ngược của " + n + " là: " + reverse);
        }

        scanner.close();
    }
}
