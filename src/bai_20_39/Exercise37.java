package bai_20_39;

import java.util.Scanner;

/**
 * Bài 37: Tính S(n) = CanBac N(N + CanBac N – 1(N – 1 + … + CanBac3(3 + CanBac2(2))) có n – 1 dấu căn
 */
public class Exercise37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập vào số nguyên dương n (n >= 2): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Vui lòng nhập số nguyên n >= 2.");
        } else {
            double result = tinhS(n);
            System.out.printf("Giá trị của S(%d) = %.5f\n", n, result);
        }

        scanner.close();
    }


    public static double tinhS(int n) {
        if (n == 2) {
            return Math.pow(2, 1.0 / 2); // x ^ (1/6)
        }
        return Math.pow(n + tinhS(n - 1), 1.0 / n);
    }
}