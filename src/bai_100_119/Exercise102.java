package bai_100_119;
/**
 * Bài 102: Viết chương trình nhập vào 1 ngày
 * ( ngày, tháng, năm). Tìm ngày kế ngày vừa nhập (ngày, tháng, năm)
 */

import java.util.Scanner;

public class Exercise102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        int daysInMonth = getDaysInMonth(month, year);
        day++;

        if (day > daysInMonth) {
            // vd tháng 10 năm 2008 có 31 ngày nếu day lớn dơn 31 thì + lên
            day = 1; // chuyển sang ngày đầu tháng
            month++; // tăng tháng lên

            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.println("Ngày kế tiếp là: " + day + "/" + month + "/" + year);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Hàm trả về số ngày trong một tháng
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
                //Đây là điều kiện bạn muốn kiểm tra. Nó có
            // thể là một biểu thức trả về giá trị kiểu boolean (true/false).
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
}