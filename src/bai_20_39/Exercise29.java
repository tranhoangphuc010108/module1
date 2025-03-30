package bai_20_39;

import java.util.Scanner;

/**
 * Bài 29: Tìm ước số lẻ lớn nhất của số nguyên dương n. Ví dụ n = 100 ước lẻ lớn nhất là 25
 */
public class Exercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhâp vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.print("Nhâp vào số nguyên dương n>0 xin nhập lại");
        } else {
            int uocLeMax = uocLeLonNhat(n);
            System.out.println("Ước số lẻ lớn nhất của " + n + " là: " + uocLeMax);
        }
        scanner.close();
    }

    public static int uocLeLonNhat(int n) {
        int maxOddDivisor = 1;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0 && n % i == 0) {
                maxOddDivisor = i;
            }
        }
        return maxOddDivisor;
    }
}
