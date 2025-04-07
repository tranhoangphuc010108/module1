package bai_82_99;

import java.util.Scanner;

/**
 * Bài 82: Viết chương trình tìm số lớn nhất trong 3 số thực a, b, c
 */
public class Exercise82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();

        double max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= c && b >= a) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Số lơn nhất là: " + max);
        scanner.close();
    }
}
