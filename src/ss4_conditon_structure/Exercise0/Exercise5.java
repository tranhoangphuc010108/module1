package ss4_conditon_structure.Exercise0;

import java.util.Scanner;

/**
 * Giải phương trình bậc 1 có dạng: ax + b = 0.
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("x =" + x);
        }
        }
    }