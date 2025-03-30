package ss4_conditon_structure.exercise;

import java.util.Scanner;

/**
 *  * Giải phương trình bậc 1 có dạng: ax + b = 0.
 * TH1
 *      + a = 0 => b = 0
 *          b = 0: 0 = 0 => VSN
 *          b != 0: => VN
 *      + a != 0
 *          x = -b/a
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }
}