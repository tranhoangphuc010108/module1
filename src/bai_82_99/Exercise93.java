package bai_82_99;

import java.util.Scanner;

/**
 * Bài 93: Viết chương trình kiểm tra 1 số có phải là số nguyên tố hay không
 */
public class Exercise93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập một số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số lớn hơn 0!");
            }
        } while (n <= 0);

        // Kiểm tra và in kết quả
        if (laSoNguyenTo(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }

        scanner.close();

    }

    public static boolean laSoNguyenTo(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
