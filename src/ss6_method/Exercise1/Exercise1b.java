package ss6_method.Exercise1;

import java.util.Scanner;

/**
 * b. Viết phương thức giải phương trình bậc nhất
 */
public class Exercise1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.println("Kết quả của phương trình bậc nhất: ");
        levelOne(a, b);
    }

    static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm: ");
            } else {
                System.out.println("Phương trình vô nghiệm: ");
            }
        } else {
            double x = -b/a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }
}