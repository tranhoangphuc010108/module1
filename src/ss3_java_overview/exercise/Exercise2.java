package ss3_java_overview.exercise;

import java.util.Scanner;

/**
 * Viết một chương trình Java để nhập vào
 * hai số nguyên a và b từ người dùng.
 * Sau đó, tính và hiển thị tổng, hiệu,
 * tích và thương của hai số đó.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;

        int product = a * b;
        double quotient = (double) a/b;

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);

        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
    }
}
