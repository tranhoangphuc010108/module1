package bai_82_99;

/**
 * Bài 87: Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000
 */
public class Exercise87 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;

        while (sum <= 10000) {
            sum += n;
            n++;
        }
        System.out.println("số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000 là: " + (n - 1));
    }
}
