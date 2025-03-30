package ss4_conditon_structure.Exercise0;

import java.util.Scanner;

/**
 * Viết chương trình tính lương của nhân viên dựa theo thâm niên công tác (TNCT) như sau:
 *
 *  Lương = hệ số * lương căn bản, trong đó lương căn bản là 650000 $.
 *
 * • Nếu TNCT < 12 tháng: hệ số = 1.92
 *
 * • Nếu 12 <= TNCT < 36 tháng: hệ số = 2.34
 *
 * • Nếu 36 <= TNCT < 60 tháng: hệ số = 3
 *
 * • Nếu TNCT >= 60 tháng: hệ số = 4.5
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("thâm niên công tác (TNCT):");
        int tnct = scanner.nextInt();

        double basicSalary = 650000.0;

        double quantilyCoefficient;

        if (tnct < 12) {
            quantilyCoefficient = 1.92;
        } else if ( tnct < 36) {
            quantilyCoefficient = 2.34;
        } else if ( tnct < 60) {
            quantilyCoefficient = 3;
        } else {
            quantilyCoefficient = 4.5;
            double salary = basicSalary * quantilyCoefficient;
            System.out.println("Lương của nhân viên là: " + salary);

        }
    }
}
