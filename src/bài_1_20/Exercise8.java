package bài_1_20;

import java.util.Scanner;

/**
 * Bài 8: Tính S(n) = ½ + ¾ + 5/6 + … + 2n + 1/ 2n + 2
 */
public class Exercise8 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int n;
                do {
                    System.out.print("Nhập vào số nguyên dương n: ");
                    n = scanner.nextInt();
                    if (n <= 0) {
                        System.out.print("Vui lòng nhập số nguyên dương lớn hơn 0!");
                    }
                } while (n <= 0);

                double sum = 0.0;
                for (int i = 0; i <= n; i++) {
                    sum += (2 * i + 1.0) / (2 * i + 2);
                }
                System.out.println("Tổng S(n) = " + sum);

                scanner.close();
            }
        }



