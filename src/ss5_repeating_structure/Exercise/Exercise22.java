package ss5_repeating_structure.Exercise;

/**
 * Nhập vào 2 số nguyên dương a & b với điều kiện là b > a.
 * Hãy thực hiện đếm và tính tổng trong đoạn[a, b]
 * có bao nhiêu số đối xứng, chính phương, nguyên tố
 */

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập số nguyên dương b(b > a): ");
        int b = scanner.nextInt();

        int soLuongSoDoiXung = 0;
        int tongSoDoiXung = 0;

        int soLuongSoChinhPhuong = 0;
        int tongSoChinhPhuong = 0;

        int soLuongSoNguyenTo = 0;
        int tongSoNguyenTo = 0;

        for (int n = a; n <= b; n++) {
            String str = Integer.toString(n);

            // Xử lý số đối xứng
            boolean isPalindromo = true;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isPalindromo = false;
                    break;
                }
            }
            if (isPalindromo) {
                soLuongSoDoiXung++;
                tongSoDoiXung += n;
            }

            // Số chính phương
            if (Math.sqrt(n) % 1 == 0) {
                soLuongSoChinhPhuong++;
                tongSoChinhPhuong += n;
            }

            // Số nguyên tố
            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                soLuongSoNguyenTo++;
                tongSoNguyenTo += n;
            }
        }

        System.out.printf("Số đối xứng trong đoạn [%d, %d]: %d\n", a, b, soLuongSoDoiXung);
        System.out.printf("Tổng số đối xứng trong đoạn [%d, %d]: %d\n", a, b, tongSoDoiXung);

        System.out.printf("Số chính phương trong đoạn [%d, %d]: %d\n", a, b, soLuongSoChinhPhuong);
        System.out.printf("Tổng chính phương trong đoạn [%d, %d]: %d\n", a, b, tongSoChinhPhuong);

        System.out.printf("Số nguyên tố trong đoạn [%d, %d]: %d\n", a, b, soLuongSoNguyenTo);
        System.out.printf("Tổng nguyên tố trong đoạn [%d, %d]: %d\n", a, b, tongSoNguyenTo);

    }
}