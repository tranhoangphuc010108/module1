package bai_82_99;

import java.util.Scanner;

/**
 * Bài 89: Viết chương trình tính tổng các giá trị lẻ nguyên dương nhỏ hơn N
 */
public class Exercise89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i += 2) {
            sum += i;
        }
        System.out.println("Tổng các giá trị lẻ nhỏ hơn " + n + " là: " + sum);
        scanner.close();
    }
}
