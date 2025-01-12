package ss4_Conditon_structure.Exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        /**
         * Giải phương trình bậc 2 có dạng: a𝑥2 + bx + c = 0.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhâp hệ số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhâp hệ số b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhâp hệ số c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiệm kép của phương trình là x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm của phương trình là x1 = " + x1 + " và x2 = " + x2);

            }
        }
    }
}
