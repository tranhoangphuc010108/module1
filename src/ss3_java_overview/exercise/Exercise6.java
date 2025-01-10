package ss3_java_overview.exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào biển số xe của bạn: ");
        int n = scanner.nextInt();

        int sum = n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n;

        int buttonNumber = sum % 10;

        System.out.println("Số nút: " + buttonNumber);







    }
}
