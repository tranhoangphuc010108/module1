package bai_60_79;
/**
 * Bài  66: Giải phương trình bậc  4
 * giải phương trình bậc 4 ax4 + bx2 + c = 0
 */

import java.util.Scanner;

public class Exercise66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập vào số b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập vào số c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Phương trình không phải bậc 4.");
        } else {
            // Tính delta
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else {
                // Tính nghiệm của phương trình bậc 2
                double t1 = (-b + Math.sqrt(delta)) / (2 * a);
                double t2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Nghiệm của t: t1 = " + t1 + ", t2 = " + t2);

                // Tìm nghiệm x từ x^2 = t
                giaiNghiemX(t1);
                giaiNghiemX(t2);
            }
        }
        scanner.close();
    }

    // Hàm tìm nghiệm x từ x^2 = t
    public static void giaiNghiemX(double t) {
        if (t < 0) {
            System.out.println("Không có nghiệm thực cho t = " + t);
        } else {
            double x1 = Math.sqrt(t);
            double x2 = -Math.sqrt(t);
            System.out.println("Nghiệm: x = " + x1 + ", x = " + x2);
        }
    }
}