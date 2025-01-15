package ss4_Conditon_structure.Exercise;

import java.util.Scanner;

/**
 * Nhập vào thông tin 1 ngày (ngày - tháng - năm).
 * Kiểm tra ngày có hợp lệ hay không ? Nếu hợp lệ
 * hãy tìm ra ngày kế tiếp (ngày - tháng - năm) &
 * ngày trước đó (ngày - tháng - năm).
 */

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày: ");
        int day = scanner.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ");

            return;
        }

        System.out.print("Nhập tháng: ");

        int month = scanner.nextInt();

        if (month < 1 || month > 12) {

            System.out.println("Tháng không hợp lệ");

            return;
        }
    }
}


