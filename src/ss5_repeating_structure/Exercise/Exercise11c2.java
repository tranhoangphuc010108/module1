package ss5_repeating_structure.Exercise;


/**
 * Viết chương trình tính:
 * <p>
 * S = 1+1/3!+1/5!+…..+1/(2n-1)!
 * <p>
 * Số n được nhập từ bàn phím
 */
import java.util.Scanner;

public class Exercise11c2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();
        double S = 0.0;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            S += 1.0 / fact;
            fact *=  (2 * i) * (2 * i + 1);
        }
        System.out.print("S = " + S);
    }
}
