package bài_1_20;
/**
 * Bài 16: Tính S(n) = x + x^2/(1 + 2 ) + x^3/( 1 + 2 + 3)  + … + x^n/(1 + 2 + 3 + …. + N)
 */

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        double x;

        System.out.print("Nhập giá trị x: ");
        x = scanner.nextDouble();

        do {
            System.out.print("Nhập vào số nguyên dương n(n>0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Nhập vào số nguyên dương n(n>0). vui lòng nhập lại: ");
            }
        } while (n <= 0);

        double sum = 0;
        int denominator = 0;
        double power = 1.0;
        for (int i = 1; i <= n; i++) {
            denominator += i;
           power *= x;
           sum += power / denominator;


        }
        System.out.println(" S(n) = " + sum);
        scanner.close();
    }
}
