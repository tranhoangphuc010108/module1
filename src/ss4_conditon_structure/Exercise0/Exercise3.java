package ss4_conditon_structure.Exercise0;
/**
 * Nhập vào 2 số nguyên, lưu vào 2 biến a và b. Sau đó,đảo giá trị
 * của 2 biến này rồi xuất giá trị của chúng ra màn hình console.
 */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tự nhiên a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập số tự nhiên b: ");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Đảo giá trị: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
