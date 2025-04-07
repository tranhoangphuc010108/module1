package bai_82_99;

import java.util.Scanner;

/**
 * Bài 90: Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 + 2 + … + m < N
 */
public class Exercise90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int m = 0;
            while (sum + (m + 1) < n) {
                m++;
                sum += m;
        }
        System.out.println("Số nguyên dương m lớn nhất sao cho 1 + 2 + ... + m < " + n + " là: " + m);
    }
}
