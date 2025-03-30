package bai_20_39;
/**
 * Bài 23: Đếm số lượng “ước số” của số nguyên dương n
 */

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số nguyên dương n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // Bước 2: Kiểm tra nếu n <= 0 thì báo lỗi
        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương!");
        } else {
            // Bước 3: Gọi hàm đếm ước số
            int soLuongUoc = demUocSo(n);

            // Bước 4: Xuất kết quả
            System.out.println("Số lượng ước số của " + n + " là: " + soLuongUoc);
        }

        scanner.close();
    }

    // Hàm đếm số lượng ước số của n
    public static int demUocSo(int n) {
        int count = 0; // Biến đếm số lượng ước số

        // Duyệt từ 1 đến căn bậc hai của n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // Nếu i là ước số của n
                count++; // Tăng biến đếm
                }
            }

        return count; // Trả về số lượng ước số
    }
}
