package bai_100_119;

import java.util.Scanner;

/**
 * Bài 103: Viết chương trình nhập vào 1 ngày
 * ( ngày, tháng, năm). Tìm ngày trước ngày vừa nhập (ngày, tháng, năm)
 */
public class Exercise103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào day:");
        int day = scanner.nextInt();

        System.out.println("Nhập vào tháng:");
        int month = scanner.nextInt();

        System.out.println("Nhập vào năm:");
        int year = scanner.nextInt();

        int daysInMonth = getDaysInMonth(month, year);
        day--;

        if (day == 0) {
            if (month == 1) {
                month = 12;
                year--;
                day = 31;
            } else {
                month--;
                day = getDaysInMonth(month, year);
            }
        }
        System.out.println("Ngày trước là: " + day + "/" + month + "/" + year);

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}
