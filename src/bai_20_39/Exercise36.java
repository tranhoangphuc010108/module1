package bai_20_39;

import java.util.Scanner;

/**
 * Bài 36: Tính S(n) = CanBac2(n! + CanBac2((n-1)! +CanBac2((n – 2)!
 * + … + CanBac2(2!) + CanBac2(1!)))) có n dấu căn
 */
public class Exercise36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.print("Nhập vào số nguyên dương n(n>0). Vui lòng nhập lại!");
        } else {
            double result = tinhS(n);
            System.out.print("Giá trị của S( " + n + " ) = " + result);
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
        if (n == 1) {
            return 1;
        }
        return Math.sqrt(tinhGiaiThua(n) + tinhS(n - 1));
    }
}
