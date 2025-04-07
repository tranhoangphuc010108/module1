package bai_82_99;

import java.util.Scanner;

/**
 * Bài 92: Tìm ước số chung lớn nhất của 2 số nguyên dương
 */
public class Exercise92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        do {
            System.out.println("Nhập vào số nguyên dương a: ");
            a = scanner.nextInt();

            System.out.println("Nhập vào số nguyên dương b: ");
            b = scanner.nextInt();

            if (a <= 0 || b <= 0) {
                System.out.println("Nhập vào số nguyên dương xin nhập lại: ");
            }
        } while (a <= 0 || b <= 0);
        int uoccln = timUocCLN(a, b);
        System.out.println("ước chung lớn nhất của" + a + " và " + b + " là " + uoccln);
    }

    public static int timUocCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
