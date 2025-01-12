package ss3_java_overview.exercise;

import java.util.Scanner;

/**
 * Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của
 * một học sinh.Tính điểm trung bình của học sinh đó.
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào điểm toán: ");
        double mathScores = scanner.nextDouble();

        System.out.print("Nhập vào hệ số toán: ");
        double hsmath = scanner.nextDouble();

        System.out.print("Nhập vào điểm lý: ");
        double physicalPoint = scanner.nextDouble();

        System.out.print("Nhập vào hệ số lý: ");
        double hsphysical = scanner.nextDouble();

        System.out.print("Nhập vào điểm hóa: ");
        double chemistryPoint = scanner.nextDouble();

        System.out.print("Nhập vào hệ số hóa: ");
        double hschemistry = scanner.nextDouble();

        double averageScore = (mathScores * hsmath + physicalPoint * hsphysical + chemistryPoint * hschemistry) / (hsmath + hsphysical + hschemistry);
        System.out.println("DiemTB: " + averageScore);
    }
}
