package bài_41_60;

import java.util.Scanner;

/**
 * Bài 48: Hãy tính tích các chữ số lẻ của số nguyên dương n
 */
public class Exercise48 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {

            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            int product = 1;
            boolean hasOdd = false; // Cờ kiểm tra có chữ số lẻ không
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 1) {
                    product *= digit;
                    hasOdd = true;
                }
                temp /= 10;
            }

            if (hasOdd) {
                System.out.println("Tích chữ số lẻ trong " + n + " là: " + product);
            } else {
                System.out.println(n + " không có chữ số lẻ nào.");
            }
        }

        scanner.close();
    }
}