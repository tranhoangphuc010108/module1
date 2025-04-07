package bai_82_99;
/**
 * Bài 99: Viết chương trình nhập vào 3 số thực.
 * Hãy in 3 số ấy ra màn hình theo thứ tự tang
 * dần mà chỉ dùng tối đa 1 biến phụ
 */

import java.util.Scanner;

public class Exercise99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        double temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Thứ tự tăng dần: " + a + ", " + b + ", " + c);
        scanner.close();
    }
}
