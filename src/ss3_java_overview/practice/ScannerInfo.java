package ss3_java_overview.practice;

import java.util.Scanner;

public class ScannerInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên của bạn: ");
        String name = scanner.nextLine();

        System.out.print("Nhập vào điểm: ");
        scanner.nextLine();

        double score = scanner.nextDouble();
        System.out.println("Tên của bạn là: " + name );
    }
}