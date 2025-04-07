package bai_82_99;

import java.util.Scanner;

/**
 * Bài 84: Viết chương trình giải và biện luận phương trình bậc nhất ax + b = 0
 */
public class Exercise84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.printf("Phương trình có nghiệm x = %.2f\n", x);
        }

        scanner.close();
    }
}