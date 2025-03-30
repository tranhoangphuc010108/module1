package bài_41_60;

import java.util.Scanner;

/**
 * Bài 57: Hãy kiểm tra số nguyên dương n có toàn chữ số chẵn hay không
 */
public class Exercise57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            boolean allOdd = true;
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 1) {
                    allOdd = false;
                    break;
                }
                temp /= 10;
            }

            if (allOdd) {
                System.out.println(n + " có toàn chữ số chẵn.");
            } else {
                System.out.println(n + " không có toàn chữ số chẵn.");
            }
        }

        scanner.close();
    }
}
