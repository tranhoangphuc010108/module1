package bai_100_119;

import java.util.Scanner;

/**
 * Bài 101: Viết chương trình nhập tháng, năm. Hãy cho biết tháng đó có bao nhiêu ngày
 */
public class Exercise101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào năm: ");
        int year = scanner.nextInt();

        System.out.println("Nhập vào tháng");
        int month = scanner.nextInt();

        int day;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
                return;
        }

        System.out.println("Tháng " + month + " năm " + year + " có " + day + " ngày.");
    }
}