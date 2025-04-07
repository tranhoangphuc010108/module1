package bài_41_60;

import java.util.Scanner;

/**
 * Bài 47: Hãy tính tổng các chữ số chẵn của số nguyên dương n
 */
public class Exercise47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {

            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {

            int sum = 0;
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                temp /= 10;
            }

            System.out.println("Số lượng chữ số lẻ trong " + n + " là: " + sum);
        }

        scanner.close();
    }
}