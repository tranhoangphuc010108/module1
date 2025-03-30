package bài_41_60;

import java.util.Scanner;

/**
 * Bài 49: Cho số nguyên dương n. Hãy tìm chữ số đầu tiên của n
 */
public class Exercise49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            int firstDigit = n;

            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

            System.out.println("Chữ số đầu tiên của " + n + " là: " + firstDigit);
        }

        scanner.close();
    }
}
