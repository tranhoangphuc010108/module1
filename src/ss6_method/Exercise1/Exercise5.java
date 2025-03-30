package ss6_method.Exercise1;

import java.util.Scanner;

/**
 * Phương thức in ra n phần tử của dãy Fibonacy.
 */
public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số lượng phần tử của dãy Fibonacy muốn in: ");
        int n = scanner.nextInt();

        System.out.printf("%d phần tử của dãy Fibonacy: ", n);
        printsNElementsFibonacy(n);
    }
    static void printsNElementsFibonacy(int n) {
        int f1 = 0;
        int f2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(f1 + "\t");
            int fn = f1 + f2; // 0 1 2
            f1 = f2; // 1 1
            f2 = fn; // 1 2


        }
    }
}
