package ss6_method.Exercise1;

import java.util.Scanner;

/**
 * Bài tập chương câu lệnh lặp. Phương thức nhận vào một số nguyên dương n và thực hiện
 * a.    Trả về số đảo của số đó.
 * b.    Có phải là số đối xứng (Trả về True/False)
 * c.    Có phải là số chính phương.
 * d.    Có phải là số nguyên tố.
 * e.    Tổng các chữ số lẻ.
 * f.    Tổng các chữ số nguyên tố.
 * g.    Tổng các chữ số chính phương.
 */
public class Exercise2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

// a.    Trả về số đảo của số đó.
        System.out.printf("số đảo của %d: %d\n", n, reversedNumber(n));

        //  b.    Có phải là số đối xứng (Trả về True/False)
        if (isSymmetricalNumber(n)) {
            System.out.printf("%d là số đối xứng\n", n);
        } else {
            System.out.printf("%d không là số đối xứng\n", n);
        }

//   c.    Có phải là số chính phương.
        if (isSquareNumber(n)) {
            System.out.printf("%d là số chính phương\n", n);
        } else {
            System.out.printf("%d không là số chính phương\n", n);
        }

        // d.    Có phải là số nguyên tố.
        if (isPrimeNumber(n)) {
            System.out.printf("%d là số nguyên tố\n", n);
        } else {
            System.out.printf("%d không là số  nguyên tố\n", n);
        }

// e.    Tổng các chữ số lẻ.
        System.out.printf("Tổng các chữ số lẻ của %d : %d\n", n, calculateTotalOddDigits(n));
        //f.    Tổng các chữ số nguyên tố.
        System.out.printf("Tổng các chữ số nguyên tố của %d : %d\n", n, calculateTotalOddDigits(n));
        // g.    Tổng các chữ số chính phương.
        System.out.printf("Tổng các chữ số chính phương của %d : %d\n", n, calculateTotalOddDigits(n));
    }

    //a trả về số đảo của số đó
    static int reversedNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    //b có phải là số đối xứng ko
    static boolean isSymmetricalNumber(int number) {
        return number == reversedNumber(number);
    }

    //c có phải là số chính phương
    //c có phải là số chính phương
    static boolean isSquareNumber(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    //d có phải l số nguyên tố
    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    //e tổng các chữ số lẽ
    static int calculateTotalOddDigits(int number) {

        int total = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                total += digit;
            }
            number /= 10;
        }
        return total;
    }

    //f tổng các số nguyên tố
    static int calculateTotalPrimeDigits(int number) {

        int total = 0;

        while (number != 0) {
            int digit = number % 10;
            if (isPrimeNumber(digit)) {
                total += digit;
            }
            number /= 10;
        }
        return total;
    }
    //g tổng số chính phương
    static int calculateTotalSquareDigits(int number) {

        int total = 0;

        while (number != 0) {
            int digit = number % 10;
            if (isSquareNumber(digit)) {
                total += digit;
            }
            number /= 10;
        }
        return total;
    }


}