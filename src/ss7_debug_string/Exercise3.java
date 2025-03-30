package ss7_debug_string;

import java.util.Scanner;

/**
 * Cho 2 chuỗi (String) a và b nhập vào từ bàn phím. Hãy so sánh chuỗi nào lớn hơn. (quan trọng)
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi a: ");
        String a = scanner.nextLine();

        System.out.print("Nhập vào chuỗi b: ");
        String b = scanner.nextLine();

        int compara = a.compareTo(b);

        if (compara < 0) {
            System.out.println("a < b");
        } else if (compara == 0) {
            System.out.println("a == b");
        } else {
            System.out.println("a > b");
        }
        scanner.close();
    }
}
