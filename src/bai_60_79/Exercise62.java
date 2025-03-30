package bai_60_79;

import java.util.Scanner;
/**
 * Bài 62: Cho 2 số nguyên dương a và b. Hãy tìm ước chung lớn nhất của 2 số này.
 */
public class Exercise62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên dương a và b
        System.out.print("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();

        // Tìm UCLN bằng phương pháp duyệt từ min(a, b)
        int ucln = timUCLN(a, b);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + ucln);

        scanner.close();
    }

    // Hàm tìm UCLN bằng cách duyệt từ min(a, b)
    public static int timUCLN(int a, int b) {
        int min = Math.min(a, b); // Lấy số nhỏ hơn

        for (int i = min; i >= 1; i--) { // Duyệt từ min về 1
            if (a % i == 0 && b % i == 0) {
                return i; // Trả về ước chung lớn nhất đầu tiên tìm thấy
            }
        }

        return 1; // Nếu không có ước nào lớn hơn 1, trả về 1 (vì 1 luôn là ước chung)
    }
}