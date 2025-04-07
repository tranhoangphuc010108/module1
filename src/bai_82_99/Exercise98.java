package bai_82_99;
/**
 * Bài 98: Lập chương trình giải hệ: ax + by = c
 *                                    Dx + ey = f. Các hệ số nhập từ bàn phím
 */

import java.util.Scanner;

public class Exercise98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        System.out.print("Nhập d: ");
        double d = scanner.nextDouble();

        System.out.print("Nhập e: ");
        double e = scanner.nextDouble();

        System.out.print("Nhập f: ");
        double f = scanner.nextDouble();
    }
}
