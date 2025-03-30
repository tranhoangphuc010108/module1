package bai_60_79;

import java.util.Scanner;

/**
 * Bài 63: Cho 2 số nguyên dương a và b. Hãy tìm bội chung nhỏ nhất của 2 số này
 */
public class Exercise63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();

        // Tìm BCNN bằng công thức
        int bcnn = timBCNN(a, b);
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + bcnn);

        scanner.close();
    }

    // Hàm tìm BCNN dựa trên công thức BCNN = (a * b) / UCLN(a, b)
    public static int timBCNN(int a, int b) {
        return (a * b) / timUCLN(a, b);
    }

    // Hàm tìm UCLN bằng thuật toán Euclid
    public static int timUCLN(int a, int b) {
        while (b != 0) { // Lặp đến khi b == 0
            int temp = b;
            b = a % b; // Cập nhật b là phần dư của a / b
            a = temp; // Đổi a thành b cũ
        }
        return a; // Khi b = 0, trả về a
    }
}
