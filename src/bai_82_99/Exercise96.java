package bai_82_99;

import java.util.Scanner;

/**
 * Bài 96: Viết chương trình nhập giá trị x sau tính giá trị của hàm số
 *
 * f(x) = 2x^2 + 5x + 9 khi x >= 5
 * , f(x) = -2x^2 + 4x – 9 khi x < 5
 */
public class Exercise96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào x: ");
        double x = scanner.nextDouble();

        double result;
        if (x >= 5) {
            result = 2 * Math.pow(x, 2) + 5 * x + 9;
        } else {
            result = -2 * Math.pow(x, 2) + 4 * x - 9;
        }

        System.out.println("Giá trị của hàm số tại x = " + x + " là: " + result);

        scanner.close();
    }
}