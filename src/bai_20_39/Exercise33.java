package bai_20_39;

import java.util.Scanner;

/**
 * Bài 33: Tính S(n) = CanBac2(2+CanBac2(2+….+CanBac2(2 + CanBac2(2)))) có n dấu căn
 */
public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Vui lòng nhập n >= 1.");
        } else {
            double result = tinhS(n);
            System.out.printf("Giá trị của S(%d) = %.6f\n", n, result);
        }

        scanner.close();
    }

    // n = 3
    public static double tinhS(int n) {
        if (n == 1) { // 1 == 1
            return Math.sqrt(2);
        }
        return Math.sqrt(2 + tinhS(n - 1)); // Đệ quy // Math.sqrt(2 + Math.sqrt(2 + Math.sqrt(2)))
    }
}
