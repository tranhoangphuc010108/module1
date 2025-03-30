package bai_20_39;

import java.util.Scanner;

/**
 * Bài 39: Tính S(n) = CanBac N + 1(N! +
 * CanBacN((N – 1)! + … + CanBac3(2! + CanBac2(1!))) có n dấu căn
 */
public class Exercise39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n > 2: ");
        int n = scanner.nextInt();

        if (n <= 2) {
            System.out.println("Nhập vào số nguyên dương n > 2. Xin nhập lại!");
        } else {
            double result = tinhS(n);
            System.out.printf("Giá trị của S(%d) = %.5f\n", n, result);
        }
        scanner.close();
    }

    public static long tinhGiaiThua(int n) {
        long giaiThua = 1;
        for (int i = 2; i <= n; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }

    public static double tinhS(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            long fact = tinhGiaiThua(i);
            result = Math.pow(fact + result, 1.0 / (i + 1));

        }
        return result;
    }
}
