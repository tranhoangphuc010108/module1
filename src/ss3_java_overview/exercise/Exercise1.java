package ss3_java_overview.exercise;

import java.time.Year;
import java.util.Scanner;

public class Exercise1 { // Sai quy tac dat ten class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào năm sinh của bạn: ");
        int year0fBirth = scanner.nextInt();

        int currentYear = Year.now().getValue(); // current: hien tai
        int age = currentYear - year0fBirth;
        System.out.println("Tuổi của bạn là: " + age);
        //Research: Tim hieu
        // How to get current year in java
    }
}
