package bai_20_39;

import java.util.Scanner;

/**
 * Bài 31: Cho số nguyên dương n. Kiểm tra xem n có phải là số nguyên tố hay không
 */
public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số nguyên dương n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // Kiểm tra số nguyên tố
        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }

        scanner.close();
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Số nhỏ hơn hoặc bằng 1 không phải số nguyên tố
        }
        if (n == 2) {
            return true; // 2 là số nguyên tố nhỏ nhất
        }
        if (n % 2 == 0) {
            return false; // Số chẵn lớn hơn 2 không thể là số nguyên tố
        }

        // Kiểm tra từ 3 đến sqrt(n) với bước nhảy 2 (chỉ xét số lẻ)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // Nếu chia hết thì không phải số nguyên tố
            }
        }

        return true; // Nếu không chia hết cho số nào thì là số nguyên tố
    }
}