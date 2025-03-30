package bài_1_20;

import java.util.Scanner;

/**
 * Bài 15: Tính S(n) = 1 + 1/(1 + 2) + 1/ (1 + 2 + 3 + …..) + 1/ (1 + 2 + 3 + …. + N)
 */
public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào số nguyên dương n(n>0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Nhập vào số nguyên dương n(n>0). vui lòng nhập lại: ");
            }
        } while (n <= 0);

       double sum = 0;
        int denominator = 0;
        for (int i = 1; i <= n; i++) {
            denominator += i;
            sum += 1.0 / denominator;

        }
        System.out.println(" S(n) = " + sum);
        scanner.close();
    }
}
