package bai_60_79;

import java.util.Scanner;

/**
 * Bài 60: Hãy kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái sang phải hay không
 */
public class Exercise60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // Kiểm tra số có tăng dần hay không
        if (kiemTraTangDan(n)) {
            System.out.println(n + " có các chữ số tăng dần từ trái sang phải.");
        } else {
            System.out.println(n + " không có các chữ số tăng dần từ trái sang phải.");
        }

        scanner.close();
    }

    // Phương thức kiểm tra số có tăng dần không
    public static boolean kiemTraTangDan(int n) {
        int lastDigit = n % 10; // Lấy chữ số cuối cùng

        while (n > 0) {
            n /= 10;
            int nextDigit = n % 10; // Lấy chữ số mới

            if (nextDigit >= lastDigit) {
                return false;
            }

            lastDigit = nextDigit;
        }

        return true; // Nếu không vi phạm điều kiện nào, số tăng dần
    }
}
