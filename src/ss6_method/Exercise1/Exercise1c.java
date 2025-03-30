package ss6_method.Exercise1;

import java.util.Scanner;

/**
 * c.    Viết phương thức giải phương trình bậc hai.
 */
public class Exercise1c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        System.out.println("Kết quả của phương trình bậc 2: ");
        levelTwo(a, b, c);
    }

    static void levelTwo(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm ");
                } else {
                    System.out.println("Phương trình vô nghiệm ");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình x = " + x);
            }
        }

        else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm ");
            } else if (delta == 0) {
                double x = - b / (2 * a);
                System.out.println("Nghiệm của phương trình x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm của phương trình là x1  = " + x1 + " và x2 = " + x2);
            }
        }
    }
}
