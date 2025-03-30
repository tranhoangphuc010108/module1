package ss6_method.Exercise1;

import java.util.Scanner;

/**
 * Bài tập chương Câu lệnh lặp. Phương thức nhận vào một số nguyên dương n và thực hiện:
 * a.    S = 1 + 2 + … + n
 * b.    S = 1^2 + 2^2 + … + n^2
 * c.    S = 1 + 1/2 + … + 1/n
 * d.    S = 1 * 2 * … * n
 * e.    S = 1! + 2! + … + n!
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        //a.    S = 1 + 2 + … + n
        System.out.printf("a.    S = 1 + 2 + … + %d = %d\n", n, calculateSumOfIntegers(n));

        //b.    S = 1^2 + 2^2 + … + n^2
        System.out.printf("b.    S = 1^2 + 2^2 + … + %d^2 = %d\n", n, calculateSumOfSquares(n));

        //c.    S = 1 + 1/2 + … + 1/n
        System.out.printf("c.    S = 1 + 1/2 + … + 1/%d = %.2f\n", n, calculateSum(n));

        // d.    S = 1 * 2 * … * n
        System.out.printf(" d.    S = 1 * 2 * … * %d = %d\n", n, calculateFactorial(n));

        // e.    S = 1! + 2! + … + n!
        System.out.printf(" e.    S = 1! + 2! + … + %d! = %d\n", n, calculateFactorialSum(n));
    }

    //a.    S = 1 + 2 + … + n
    static int calculateSumOfIntegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //b.    S = 1^2 + 2^2 + … + n^2
    static int calculateSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    //c.    S = 1 + 1/2 + … + 1/n
    static double calculateSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // d.    S = 1 * 2 * … * n
    static long calculateFactorial(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    // e.    S = 1! + 2! + … + n!
    static long calculateFactorialSum(int n) {
        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }
}