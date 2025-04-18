package ss6_method.Exercise1;

import java.util.Scanner;

/**
 * Viết chương trình nhập thông tin của n nhân viên trong công ty
 * (n nhập vào từ bàn phím, n <= 5). Thông tin cần nhập tương tự
 * ở câu trên. Sau khi nhập xong thì in thông tin đã nhập ra. Lưu ý: in
 * ra n nhân viên cùng lúc, không phải nhập nhân viên nào in nhân viên đó ra luôn.
 */
public class Exercise7 {

    // nhân viên 1
    static String name1;
    static int age1;
    static String sex1;
    static double salary1;
    static double averageScore1;

    // nhân viên 2
    static String name2;
    static int age2;
    static String sex2;
    static double salary2;
    static double averageScore2;

    // nhân viên 3
    static String name3;
    static int age3;
    static String sex3;
    static double salary3;
    static double averageScore3;

    // nhân viên 4
    static String name4;
    static int age4;
    static String sex4;
    static double salary4;
    static double averageScore4;

    // nhân viên 5
    static String name5;
    static int age5;
    static String sex5;
    static double salary5;
    static double averageScore5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println("Nhập vào số lượng nhân viên: ");
            n = Integer.parseInt(scanner.nextLine());

            if (n < 0 || n > 5) {
                System.out.println("Số lượng nhân viên không hợp lệ <= 5, vui lòng nhập lại");
            }
        } while (n < 0 || n > 5);

        switch (n) {
            case 1:
                System.out.println("=== Nhập thông tin nhân viên thứ 1 ===");
                enterInformation1();
                System.out.println("=== Xuất thông tin nhân viên thứ 1 ===");
                exportInformation1();
                break;

            case 2:

                System.out.println("=== Nhập thông tin nhân viên thứ 1 ===");
                enterInformation1();
                System.out.println("=== Nhập thông tin nhân viên thứ  2===");
                enterInformation2();

                System.out.println("=== Xuất thông tin nhân viên thứ 1 ===");
                exportInformation1();
                System.out.println("=== Xuất thông tin nhân viên thứ 2 ===");
                exportInformation2();
                break;

            case 3:

                System.out.println("=== Nhập thông tin nhân viên thứ 1 ===");
                enterInformation1();
                System.out.println("=== Nhập thông tin nhân viên thứ  2===");
                enterInformation2();
                System.out.println("=== Nhập thông tin nhân viên thứ  3===");
                enterInformation3();


                System.out.println("=== Xuất thông tin nhân viên thứ 1 ===");
                exportInformation1();
                System.out.println("=== Xuất thông tin nhân viên thứ 2 ===");
                exportInformation2();
                System.out.println("=== Xuất thông tin nhân viên thứ 3 ===");
                exportInformation3();
                break;

            case 4:
                System.out.println("=== Nhập thông tin nhân viên thứ 1 ===");
                enterInformation1();
                System.out.println("=== Nhập thông tin nhân viên thứ  2===");
                enterInformation2();
                System.out.println("=== Nhập thông tin nhân viên thứ  3===");
                enterInformation3();
                System.out.println("=== Nhập thông tin nhân viên thứ  4===");
                enterInformation4();


                System.out.println("=== Xuất thông tin nhân viên thứ 1 ===");
                exportInformation1();
                System.out.println("=== Xuất thông tin nhân viên thứ 2 ===");
                exportInformation2();
                System.out.println("=== Xuất thông tin nhân viên thứ 3 ===");
                exportInformation3();
                System.out.println("=== Xuất thông tin nhân viên thứ 4 ===");
                exportInformation4();
                break;

            case 5:
                System.out.println("=== Nhập thông tin nhân viên thứ 1 ===");
                enterInformation1();
                System.out.println("=== Nhập thông tin nhân viên thứ  2===");
                enterInformation2();
                System.out.println("=== Nhập thông tin nhân viên thứ  3===");
                enterInformation3();
                System.out.println("=== Nhập thông tin nhân viên thứ  4===");
                enterInformation4();
                System.out.println("=== Nhập thông tin nhân viên thứ  4===");
                enterInformation5();


                System.out.println("=== Xuất thông tin nhân viên thứ 1 ===");
                exportInformation1();
                System.out.println("=== Xuất thông tin nhân viên thứ 2 ===");
                exportInformation2();
                System.out.println("=== Xuất thông tin nhân viên thứ 3 ===");
                exportInformation3();
                System.out.println("=== Xuất thông tin nhân viên thứ 4 ===");
                exportInformation4();
                System.out.println("=== Xuất thông tin nhân viên thứ 4 ===");
                exportInformation5();
                break;
        }
    }
    static void enterInformation1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        name1 = scanner.nextLine();

        System.out.println("Nhập vào tuổi: ");
        age1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào giới tính: ");
        sex1 = scanner.nextLine();

        System.out.println("Nhập vào mức lương: ");
        salary1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập vào điểm trung bình: ");
        averageScore1 = Double.parseDouble(scanner.nextLine());
    }

    static void enterInformation2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        name2 = scanner.nextLine();

        System.out.println("Nhập vào tuổi: ");
        age2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào giới tính: ");
        sex2 = scanner.nextLine();

        System.out.println("Nhập vào mức lương: ");
        salary2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập vào điểm trung bình: ");
        averageScore2 = Double.parseDouble(scanner.nextLine());
    }

    static void enterInformation3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        name3 = scanner.nextLine();

        System.out.println("Nhập vào tuổi: ");
        age3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào giới tính: ");
        sex3 = scanner.nextLine();

        System.out.println("Nhập vào mức lương: ");
        salary3 = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập vào điểm trung bình: ");
        averageScore3 = Double.parseDouble(scanner.nextLine());

    }
    static void enterInformation4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        name4 = scanner.nextLine();

        System.out.println("Nhập vào tuổi: ");
        age4 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào giới tính: ");
        sex4 = scanner.nextLine();

        System.out.println("Nhập vào mức lương: ");
        salary4 = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập vào điểm trung bình: ");
        averageScore4 = Double.parseDouble(scanner.nextLine());
    }

    static void enterInformation5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        name5 = scanner.nextLine();

        System.out.println("Nhập vào tuổi: ");
        age5 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào giới tính: ");
        sex5 = scanner.nextLine();

        System.out.println("Nhập vào mức lương: ");
        salary5 = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập vào điểm trung bình: ");
        averageScore5 = Double.parseDouble(scanner.nextLine());
    }
    static void exportInformation1() {
        System.out.println("Tên: " + name1);
        System.out.println("Tuổi: " + age1);
        System.out.println("Giới tính: " + sex1);
        System.out.println("Mức lương: " + salary1);
        System.out.println("Điểm trung bình: " + averageScore1);
    }
    static void exportInformation2() {
        System.out.println("Tên: " + name2);
        System.out.println("Tuổi: " + age2);
        System.out.println("Giới tính: " + sex2);
        System.out.println("Mức lương: " + salary2);
        System.out.println("Điểm trung bình: " + averageScore2);
    }
    static void exportInformation3() {
        System.out.println("Tên: " + name3);
        System.out.println("Tuổi: " + age3);
        System.out.println("Giới tính: " + sex3);
        System.out.println("Mức lương: " + salary3);
        System.out.println("Điểm trung bình: " + averageScore3);
    }

    static void exportInformation4() {
        System.out.println("Tên: " + name4);
        System.out.println("Tuổi: " + age4);
        System.out.println("Giới tính: " + sex4);
        System.out.println("Mức lương: " + salary4);
        System.out.println("Điểm trung bình: " + averageScore4);
    }

    static void exportInformation5() {
        System.out.println("Tên: " + name5);
        System.out.println("Tuổi: " + age5);
        System.out.println("Giới tính: " + sex5);
        System.out.println("Mức lương: " + salary5);
        System.out.println("Điểm trung bình: " + averageScore5);
    }
}
