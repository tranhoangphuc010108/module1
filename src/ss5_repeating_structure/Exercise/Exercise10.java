package ss5_repeating_structure.Exercise;

/**
 * Viết chương trình tính :
 * <p>
 * S=1/1+1/2+1/3+....+1/n
 * <p>
 * Số n được nhập từ bàn phím
 */
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("1/2 = " + 3.0/2); // so nguyen / so nguyen = so nguyen (Chi lay phan nguyen)

        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();
        double S = 0;

        for (int i = 1; i <= n; i++) {
            S += 1.0 / i;
        }

        System.out.println("Tổng S = " + S);

    }
}
