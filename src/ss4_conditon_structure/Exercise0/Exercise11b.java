package ss4_conditon_structure.Exercise0;

import java.util.Scanner;

public class Exercise11b {
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
        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;

        previousDay--;
        if (previousDay < 1) {
            previousMonth--;
            if (previousMonth < 1) {
                previousMonth = 12;
                previousYear--;
            }
            if (previousMonth == 4 || previousMonth == 6 || previousMonth == 9 || previousMonth == 11) {
                previousDay = 30;
            } else if (previousMonth == 2) {
                if (isLeapYear) {
                    previousDay = 29;
                } else {
                    previousDay = 28;
                }
            } else {
                previousDay = 31;
            }
        }
        System.out.printf("Ngày trước đó: %d/%d/%d", previousDay, previousMonth, previousYear);
    }
}
