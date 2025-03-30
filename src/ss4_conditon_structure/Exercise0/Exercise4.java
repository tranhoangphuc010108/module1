package ss4_conditon_structure.Exercise0;
/**
 * Nhập vào 2 số nguyên a, b. In ra
 * màn hình kết quả số lớn nhất, nhỏ nhất.
 */

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập số tự nhiên b: ");
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
