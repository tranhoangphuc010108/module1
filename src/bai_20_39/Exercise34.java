package bai_20_39;

/**
 * Bài 34: Tính S(n) = CanBac2(n+CanBac2(n – 1 + CanBac2( n – 2 + … + CanBac2(2 + CanBac2(1)  có n dấu căn
 */
import java.util.Scanner;


public class Exercise34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Nhập vào số nguyên dương n(n>0). vui lòng nhập lại! ");
        } else {
            double result = tinhS(n);
            System.out.println("Giá trị của S(" + n + ") = " + result);
        }

        scanner.close();
    }

    public static double tinhS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return Math.sqrt(n + tinhS(n - 1));
        }


    }
}
