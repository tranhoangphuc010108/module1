package bai_100_119;
/**
 * Bài 104: Viết chương trình nhập ngày, tháng, năm. Tính xem ngày đó là ngày thứ bao nhiêu trong năm
 */

import java.util.Scanner;

public class Exercise104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào day:");
        int day = scanner.nextInt();

        System.out.println("Nhập vào tháng:");
        int month = scanner.nextInt();

        System.out.println("Nhập vào năm:");
        int year = scanner.nextInt();
        int dayOfYear = getDayOfYear(day, month, year);


        System.out.println("Ngày " + day + "/" + month + "/"
                + year + " là ngày thứ " + dayOfYear + " trong năm.");
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

    public static int getDayOfYear(int day, int month, int year) {
        int totalDays = 0;

        for (int i = 1; i < month; i++) {
            totalDays += getDaysInMonth(i, year);
        }

        // Cộng số ngày của tháng nhập
        totalDays += day;

        return totalDays;
    }
}