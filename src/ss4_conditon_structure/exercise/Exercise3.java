package ss4_conditon_structure.exercise;

import java.util.Scanner;

/**
 * Nhập vào 2 số nguyên, lưu vào 2 biến a và b. Sau đó,đảo giá trị
 * của 2 biến này rồi xuất giá trị của chúng ra màn hình console.
 */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất (a): ");
        int a = scanner.nextInt(); // 2

        System.out.println("Nhập số thứ hai (b): ");
        int b = scanner.nextInt(); // 3

        int temp = a; // temp = 2
        a = b; // a = 3
        b = temp; // b = 2

        System.out.println("Sau khi đảo giá trị: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}