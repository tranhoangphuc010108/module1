package bai_82_99;
/**
 * Bài 83: Viết chương trình nhập 2 số thực, kiểm tra xem chúng có cùng dấu hay không
 */

import java.util.Scanner;

public class Exercise83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();

        if (a > 0 && b > 0 || a < 0 && b < 0) {
            System.out.println(a + b + "cùng dấu");
        } else {
            System.out.println(a + b + "khác dấu");
        }
        scanner.close();
    }
}
