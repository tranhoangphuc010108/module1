package ss3_java_overview.exercise;

import java.util.Scanner;

/**
 * Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
 *
 * Công thức
 * Chu vi: C = 2 * π * r
 * Diện tích: A = π * r²
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bán kính r: ");
        double r = scanner.nextDouble();

        double c = 2 * Math.PI * r;

        double a = Math.PI * Math.pow(r, 2);

        System.out.println("Chu vi C = " + c);
        System.out.println("Diện tích A = " + a);
    }
}
