package bai_82_99;
/**
 * Bài 97: Viết chương trình nhập 3 cạnh của 1 tam giác, cho biết đó là tam giác gì
 */

import java.util.Scanner;

public class exercise97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && a == c) {
                System.out.println("Đây là tam giác đều");
            } else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân.");
            } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                System.out.println("Đây là tam giác vuông ");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {

            System.out.println("Ba cạnh không tạo thành một tam giác hợp lệ.");
        }
    }
}
