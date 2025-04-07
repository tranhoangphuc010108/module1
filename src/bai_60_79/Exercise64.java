package bai_60_79;

import java.util.Scanner;

/**
 * Bài 64: Giải phương trình bậc 1 :ax+b=0
 */
public class Exercise64 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghệm: ");
            } else {
                System.out.println("Phương trình vô nghiệm: ");

            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
        scanner.close();
    }
}
