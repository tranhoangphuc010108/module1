package bài_1_20;

import java.util.Scanner;

/**
 * Bài 5: Tính S(n) = 1 + 1/3 + 1/5 + … + 1/(2n + 1)
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào só nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Vui lòng nhập số nguyên dương lớn hơn 0!");
            }
        } while (n <= 0);
         double sum = 0.0;
        for (int i = 0; i <= n; i++) {
            sum += 1.0/(2 * i + 1);
        }
        System.out.println("Tổng S(n) = " + sum);

        scanner.close();
    }
}
