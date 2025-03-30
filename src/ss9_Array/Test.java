package ss9_Array;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập vào số lượng phần tử của mảng: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Nhập lại số nguyên dương(n>0), xin nhập lại: ");
            }
        } while (n <= 0);

        int[] arr = new int[n];

        inputArray(arr);
    }

    public static void inputArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt();

        }
    }
}