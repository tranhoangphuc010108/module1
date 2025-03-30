package ss4_conditon_structure.exercise;

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
        /*
        30 11 2025 => 01 12 2025 => Đặc biệt
        01 12 2025 => 02 12 2025
        28 2 2024 => 29 2 2024 => Đặc biệt
        28 2 2025 => 01 3 2024 => Đặc biệt
        31 12 2025 => 01 01 2026 => Đặc biệt

        TH1
        31 10 2025 => 1 11 2025 => Đặc biệt

        TH2
        28 2 2024 => 29 2 2024 => Đặc biệt
        28 2 2025 => 01 3 2024 => Đặc biệt

        TH3
        30 4 2025 => 01 5 2025 => Đặc biệt

        31 12 2025 => 01 01 2026 => Đặc biệt
         */
//        System.out.println("Bắt đầu chương trình");
//        if(false) { // false - không thực hiện body => k return => chương trình vẫn tiếp tục
//            return;
//        }
//
//        System.out.println("Chương trình kết thúc");

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


