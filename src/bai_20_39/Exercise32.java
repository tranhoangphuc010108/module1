package bai_20_39;

import java.util.Scanner;

/**
 * Bài 32: Cho số nguyên dương n. Kiểm tra xem n có phải là số chính phương hay không
 * perfectSquare
 */
public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (perfectSquare(n)) {
            System.out.println(n + " là số chính phương.");
        } else {
            System.out.println(n + " không phải là số chính phương.");
        }

        scanner.close();
    }
    public static boolean perfectSquare(int n) {
        if (n < 0) {
            return false; // Không có số chính phương âm
        }

        int sqrt = (int) Math.sqrt(n); // Tính căn bậc hai và ép kiểu về int
        return (sqrt * sqrt == n); // Kiểm tra nếu bình phương của sqrt có bằng n hay không
    }
}
