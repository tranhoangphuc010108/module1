package bai_82_99;

import java.util.Scanner;

public class Exercise85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một tháng (1 - 12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ! Vui lòng nhập từ 1 đến 12.");
        } else if (month >= 1 && month <= 3) {
            System.out.println("Tháng " + month + " thuộc quý 1.");
        } else if (month >= 4 && month <= 6) {
            System.out.println("Tháng " + month + " thuộc quý 2.");
        } else if (month >= 7 && month <= 9) {
            System.out.println("Tháng " + month + " thuộc quý 3.");
        } else {
            System.out.println("Tháng " + month + " thuộc quý 4.");
        }

        scanner.close();
    }
}
