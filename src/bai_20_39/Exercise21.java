package bai_20_39;

import java.util.Scanner;

/**
 * Bài 21: Tính tổng tất cả các “ ước số” của số nguyên dương n
 */
public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            System.out.println("Tổng tất cả các ước số của " + n + " là: " + sum);
        }
        scanner.close();
    }
}

