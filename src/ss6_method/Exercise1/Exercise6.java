package ss6_method.Exercise1;

import java.util.Scanner;

/**
 * Viết chương trình nhập thông tin của một nhân viên trong công ty.
 * Thông tin cần nhập vào bao gồm: họ tên, tuổi, giới tính,
 * mức lương cơ bản, điểm trung bình tốt nghiệp đại học (theo thang điểm 10)
 * . Sau khi nhập xong thì in thông tin đã nhập ra
 */
public class Exercise6 {
    static String name;
    static int age;
    static String sex;
    static double salary;
    static double averageScore;

    public static void main(String[] args) {

        enterInformation();
        exportInformation();
    }

    static void enterInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        name = scanner.nextLine();

        System.out.println("Nhập vào tuổi: ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào giới tính: ");
        sex = scanner.nextLine();

        System.out.println("Nhập vào mức lương: ");
        salary = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập vào điểm trung bình: ");
        averageScore = Double.parseDouble(scanner.nextLine());
    }
    static void exportInformation() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + sex);
        System.out.println("Mức lương: " + salary);
        System.out.println("Điểm trung bình: " + averageScore);
    }
}