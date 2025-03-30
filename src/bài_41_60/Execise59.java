package bài_41_60;

import java.util.Scanner;

/**
 * Bài 59: Hãy kiểm tra số nguyên dương n có phải là số đối xứng hay không
 */
public class Execise59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (kiemTraDoiXung(n)) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không phải là số đối xứng.");
        }

        scanner.close();
    }

    // Phương thức kiểm tra số đối xứng
    public static boolean kiemTraDoiXung(int n) {
        int original = n; // Lưu lại số ban đầu
        int reversed = 0;  // Biến để lưu số đảo ngược

        while (n > 0) {
            int lastDigit = n % 10; // Lấy chữ số cuối cùng
            reversed = reversed * 10 + lastDigit; // số đảo ngược
            n = n / 10; // Loại bỏ chữ số cuối cùng
        }

        return original == reversed; // So sánh với số ban đầu
    }
}
