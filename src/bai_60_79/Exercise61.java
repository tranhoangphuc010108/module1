package bai_60_79;

import java.util.Scanner;

/**
 * Bài 61: Hãy kiểm tra các chữ số của số nguyên dương n có giảm dần từ trái sang phải hay không
 */
public class Exercise61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // Kiểm tra số có giảm dần hay không
        if (kiemTraGiamDan(n)) {
            System.out.println(n + " có các chữ số giảm dần từ trái sang phải.");
        } else {
            System.out.println(n + " không có các chữ số giảm dần từ trái sang phải.");
        }

        scanner.close();
    }

    // Phương thức kiểm tra số có giảm dần hay không
    public static boolean kiemTraGiamDan(int n) {
        int lastDigit = n % 10;

        while (n > 0) {
            n /= 10; // Bỏ chữ số cuối để lấy chữ số tiếp theo (bên trái)
            int nextDigit = n % 10; // Lấy chữ số mới

            if (nextDigit <= lastDigit) { // Kiểm tra nếu không giảm dần
                return false;
            }

            lastDigit = nextDigit; // Cập nhật chữ số cuối để tiếp tục kiểm tra
        }

        return true; // Nếu không vi phạm điều kiện nào, số giảm dần
    }
}




