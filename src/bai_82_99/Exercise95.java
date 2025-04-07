package bai_82_99;

import java.util.Scanner;

/**
 * Bài 95: Viết chương trình nhập 3 số thực. Hãy thay tất cả các số âm bằng trị tuyệt đối của nó
 */
public class Exercise95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();

        //  Math.abs(num) là phương thức để lấy trị
        //  tuyệt đối của một số. Nếu số là âm, nó
        //  sẽ trả về giá trị dương, nếu số đã dương thì giữ nguyên.
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        System.out.println("Các số sau khi thay trị tuyệt đối: ");
        System.out.println("Số 1: " + a);
        System.out.println("Số 2: " + b);
        System.out.println("Số 3: " + c);

        scanner.close();
    }
}
