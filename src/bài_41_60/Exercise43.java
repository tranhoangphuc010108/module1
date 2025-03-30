package bài_41_60;

import java.util.Scanner;
/**
 * Bài 43: Hãy đếm số lượng chữ số của số nguyên dương n
 */
public class Exercise43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("Vui lòng nhập số nguyên dương (n > 0)!");
            }
        } while (n < 1);

        int count = 0;
        int temp = n;

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Số lượng chữ số của " + n + " là: " + count);

        scanner.close();
    }
}
