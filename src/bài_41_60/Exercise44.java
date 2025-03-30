package bài_41_60;

import java.util.Scanner;

/**
 * Bài 44: Hãy tính tổng các chữ số của số nguyên dương n
 */
public class Exercise44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Vui lòng nhập số nguyên dương (n > 0)!");
            }
        } while (n < 0);

        int sum = 0;
        int temp = n;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;

        }

        System.out.println("Số lượng chữ số của " + n + " là: " + sum);

        scanner.close();
    }
}
