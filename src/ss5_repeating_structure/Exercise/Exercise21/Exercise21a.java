package ss5_repeating_structure.Exercise.Exercise21;

import java.util.Scanner;

/**
 * Nhập một số nguyên dương n (n > 0).  Hãy cho biết:
 * a. Có phải là số đối xứng? Ví dụ: 121, 12021, …
 */
public class Exercise21a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt(); // 123219

        String str = Integer.toString(n); // "123219"
        boolean isPalindromo = true; // Phương pháp đặt cờ hiệu
        for (int i = 0; i < str.length() / 2; i++) { // i = 0; i < 3; i++: i = 0, 1, 2
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) { // str.charAt(0) != str.charAt(5)
                isPalindromo = false;
                break; // tối ưu => Thoát khỏi vòng lặp
            }
        }
        if (isPalindromo == true) {
            System.out.printf("%d là số đối xứng", n);
        } else {
            System.out.printf("%d không là số đối xứng", n);
        }
    }
}
