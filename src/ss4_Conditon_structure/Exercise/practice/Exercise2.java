package ss4_Conditon_structure.Exercise.practice;
/**
 * Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó theo 2 cách:
 * Cách 1: Dùng if else-if.
 * Cách 2: Dùng switch case.
 */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số từ 1 đến 10: ");
        int number = scanner.nextInt();

        String englishNumber;

        if (number == 1) {
            englishNumber = "One";
        } else if (number == 2) {
        englishNumber = "Two";
        } else if (number == 3) {
            englishNumber = "Three";
        } else if (number == 4) {
            englishNumber = "Four";
        } else if (number == 5) {
            englishNumber = "Five";
        } else if (number == 6) {
            englishNumber = "Six";
        } else if (number == 7) {
            englishNumber = "Seven";
        } else if (number == 8) {
            englishNumber = "Eight";
        } else if (number == 9) {
            englishNumber = "Nine";
        } else if (number == 10) {
            englishNumber = "Ten";
        } else {
            englishNumber = "Số không hợp lệ: ";
        }

        System.out.println("Số " + number + "Viết bằng tiếng anh là: " + englishNumber);
    }
}