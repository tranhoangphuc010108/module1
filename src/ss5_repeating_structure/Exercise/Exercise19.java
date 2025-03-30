package ss5_repeating_structure.Exercise;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập 1 số nguyên dương n: ");
        int n = scanner.nextInt(); // 6

        String binary = ""; // "" => chuỗi rỗng


        while (n > 0) { //
            int remainder = n % 2; // remainder = 1
            binary = remainder + binary; // 1 + "10" = "110"
            n = n / 2; // n = 0
        }
        System.out.println("Số nhị phân tương ứng là: " + binary);
    }
}
