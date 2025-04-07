package bai_60_79;

import java.util.Scanner;

/**
 * Bài 65: Giải phương trình bậc 2 :
 * ax2+bx+c=0
 */
public class Exercise65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Đây là phương trình bậc 1: ");
            giaiPhuongTrinhBac1(scanner, b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            }
        }
        scanner.close();
    }

    public static void giaiPhuongTrinhBac1(Scanner scanner, double b, double c) {
        if (b == 0) {
            if (c == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -c / b;
            System.out.println("Nghiệm của phương trình bậc 1 là: x = " + x);
        }
    }
}
