package bai_20_39;

import java.util.Scanner;
/**
 * Bài 20: Liệt kê tất cả các “ước số” của số nguyên dương n
 */
public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0.");
        } else {
            System.out.println("Các ước số của " + n + " là:");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }


        scanner.close();
    }
}
