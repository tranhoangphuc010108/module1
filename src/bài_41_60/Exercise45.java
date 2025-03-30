package bài_41_60;
/**
 * Bài 45: Hãy tính tích các chữ số của số nguyên dương n
 */

import java.util.Scanner;

public class Exercise45 {
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

        int product  = 0;
        int temp = n;

        while (temp > 0) {
            product  *= temp % 10;
            temp /= 10;

        }

        System.out.println("Số lượng chữ số của " + n + " là: " + product );

        scanner.close();
    }
}
