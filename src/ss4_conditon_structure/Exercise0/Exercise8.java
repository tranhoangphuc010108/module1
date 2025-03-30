package ss4_conditon_structure.Exercise0;

import java.util.Scanner;

/**
 * Nhập vào tháng & năm. Hãy cho biết tháng đó trong năm đó có bao nhiêu ngày.
 * Nếu tháng là 4, 6, 9, hoặc 11, số ngày là 30.
 * Nếu tháng là 2, kiểm tra xem năm có phải là năm nhuận không. Nếu là năm nhuận, số ngày là 29, nếu không, số ngày là 28.
 * Cho tất cả các tháng khác, số ngày là 31.
 */

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tháng 1-12: ");
        int month = scanner.nextInt();

        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();
        /*
        Năm nhuận: Tháng 2 có 29 ngày
        + Năm chia hết cho 4 và không chia hết cho 100: year % 4 ==0 &&  year % 100 != 0 => 10 % 5 = 0
        + Hoặc chia hết cho 400: year % 400 == 0
        => (year % 4 ==0 && year % 100 != 0) || year % 400 == 0

        Năm thường: Tháng 2 có 28 ngày
         */
        int dayInMonth;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // Năm nhuận
                    dayInMonth = 29;
                } else { // Năm thường
                    dayInMonth = 28;
                }
                break;
            default:
                dayInMonth = 31;
        }

        System.out.printf("Tháng %d năm %d là %d ngày: ", month, year, dayInMonth);
    }
}
