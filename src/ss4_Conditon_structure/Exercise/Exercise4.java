package ss4_Conditon_structure.Exercise;

import java.util.Scanner;

/**
 * Nhập vào 2 số nguyên a, b. In ra
 * màn hình kết quả số lớn nhất, nhỏ nhất.
 */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất (a): ");
        int a = scanner.nextInt();

        System.out.println("Nhập số thứ hai (b): ");
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
    }
}