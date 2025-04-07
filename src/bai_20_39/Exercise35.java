package bai_20_39;

import java.util.Scanner;

/**
 * căn 1 + căn 2 + căn 3 + ... căn n - 1 + căn n
 */
public class Exercise35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Nhập vào số nguyên dương n(n>0) xin nhập lại!!");
            }
        } while (n <= 0);
        double result = tinhS(n);
        System.out.printf("Giá trị của S(%d) = %.6f\n", n, result);
        scanner.close();
    }

    public static double tinhS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return Math.sqrt(1 + tinhS(n - 1));
        }
    }
}