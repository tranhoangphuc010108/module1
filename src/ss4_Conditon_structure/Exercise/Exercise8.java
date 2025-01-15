package ss4_Conditon_structure.Exercise;

import java.util.Scanner;

/**
 * Nhập vào tháng & năm. Hãy cho biết tháng đó trong năm đó có bao nhiêu ngày.
 */

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tháng (1-12): ");
        int month = scanner.nextInt();

        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();

        int dayInMonth;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = 30;
                break;

            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    dayInMonth = 29;
                } else {
                    dayInMonth = 28;
                }
                break;
            default:
                dayInMonth = 31;
                break;
        }
    }
}
