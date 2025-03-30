package bài_41_60;

import java.util.Scanner;

/**
 * Bài 42: Cho n là số nguyên dương. Hãy tìm giá trị
 * nguyên dương k lớn nhất sao cho S(k)  < n. Trong
 * đó chuỗi k được định nghĩa như sau: S(k) = 1 + 2 + 3 + … + k
 */
public class Exercise42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("Nhập vào số nguyên dương n(n>0).Xin nhập lại!");
            }
        } while (n < 1);

        int k = 0;
        int sum = 0;

        while (sum + (k + 1) < n) {
            k++;
            sum += k;
        }

        System.out.println("Giá trị k lớn nhất sao cho S(k) < " + n + " là: " + k);

        scanner.close();

    }
}