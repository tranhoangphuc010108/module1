package ss4_conditon_structure.Exercise0;
/**
 * Nhập vào thông tin 1 ngày (ngày - tháng - năm).
 * Kiểm tra ngày có hợp lệ hay không ? Nếu hợp lệ
 * hãy tìm ra ngày kế tiếp (ngày - tháng - năm)
 */

import java.util.Scanner;

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
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Ngày không hợp lệ: ");
                return;
            }
        }
        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Ngày không hợp lệ: ");
                    return;
                }
            } else {
                if (day > 28) {
                    System.out.println("Ngày không hợp lệ: ");
                    return;
                }
            }
        }
        System.out.println("Ngày hợp lệ:");
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        nextDay++;

        if (nextDay > 31 || (month == 2 && nextDay > (isLeapYear ? 29 : 28))
                || (month == 4 || month == 6 || month == 9 || month == 11) && nextDay > 30) {
            nextDay = 1;
            nextMonth++;
        }
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
        System.out.printf("Ngày kế tiếp: %d/%d/%d", nextDay, nextMonth, nextYear);
    }
}