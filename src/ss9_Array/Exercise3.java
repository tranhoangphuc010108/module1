package ss9_Array;

import java.util.Scanner;

/**
 *
 * Dựa trên chương trình quản lý nhân viên ở bài trước, thực hiện các yêu cầu sau:
 * <p>
 * a. Tìm nhân viên có điểm trung bình cao nhất.
 * <p>
 * b. Tìm nhân viên theo họ tên (tìm chính xác).
 * <p>
 * c. Tìm nhân viên theo họ tên (tìm mềm - Gần chính xác)
 * <p>
 * Ví dụ: Khi nhập một phần của họ tên (ví dụ: "Hoàng"), hệ thống sẽ xuất
 * ra tất cả các nhân viên có chữ "Hoàng" xuất hiện trong họ tên của họ
 * (ví dụ: "Nguyễn Văn Hoàng", "Hoàng Văn Thái", ...).
 */
public class Exercise3 {

    static String[] name = new String[5];
    static int[] age = new int[5];
    static String[] sex = new String[5];
    static double[] salary = new double[5];
    static double[] averageScore = new double[5];
    static int numberOfEmployees = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chose;

        do {
            nhapThongTin();
            System.out.print("Nhập 'yes' hoặc 'y' để tiếp tục, 'no' để dừng lại: ");
            chose = scanner.nextLine();
        } while (chose.equalsIgnoreCase("yes") || chose.equalsIgnoreCase("y"));

        hienThiDanhSach();

        System.out.println("\nNhân viên có điểm trung bình cao nhất:");
        timNhanVienDiemCaoNhat();

        System.out.print("\nNhập tên nhân viên cần tìm (chính xác): ");
        String tenChinhXac = scanner.nextLine();
        timNhanVienTheoTen(tenChinhXac);

        System.out.print("\nNhập phần của tên cần tìm (tìm gần đúng): ");
        String tenGanDung = scanner.nextLine();
        timNhanVienGanDung(tenGanDung);
    }

    // Phương thức nhập thông tin nhân viên
    public static void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập thông tin nhân viên thứ " + (numberOfEmployees + 1) + ": ");
        System.out.print("Nhập họ tên: ");
        name[numberOfEmployees] = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age[numberOfEmployees] = scanner.nextInt();
        scanner.nextLine(); // Bỏ dòng trống sau khi nhập số
        System.out.print("Nhập giới tính: ");
        sex[numberOfEmployees] = scanner.nextLine();
        System.out.print("Nhập lương: ");
        salary[numberOfEmployees] = scanner.nextDouble();
        System.out.print("Nhập điểm trung bình: ");
        averageScore[numberOfEmployees] = scanner.nextDouble();
        scanner.nextLine(); // Bỏ dòng trống sau khi nhập số

        numberOfEmployees++;
    }

    // Phương thức hiển thị danh sách nhân viên
    public static void hienThiDanhSach() {
        System.out.println("\nDanh sách nhân viên:");
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println((i + 1) + ". " + name[i] + " - Tuổi: " + age[i] +
                    " - Giới tính: " + sex[i] + " - Lương: " + salary[i] +
                    " - Điểm TB: " + averageScore[i]);
        }
    }

    // Phương thức tìm nhân viên có điểm trung bình cao nhất
    public static void timNhanVienDiemCaoNhat() {
        if (numberOfEmployees == 0) {
            System.out.println("Không có nhân viên nào.");
            return;
        }
        double maxScore = averageScore[0];
        int index = 0;

        for (int i = 1; i < numberOfEmployees; i++) {
            if (averageScore[i] > maxScore) {
                maxScore = averageScore[i];
                index = i;
            }
        }

        System.out.println("Nhân viên có điểm trung bình cao nhất: " + name[index] +
                " - Điểm TB: " + maxScore);
    }

    // Phương thức tìm nhân viên theo tên (tìm chính xác)
    public static void timNhanVienTheoTen(String ten) {
        boolean found = false;
        for (int i = 0; i < numberOfEmployees; i++) {
            if (name[i].equalsIgnoreCase(ten)) {
                System.out.println("Tìm thấy nhân viên: " + name[i] + " - Tuổi: " + age[i] +
                        " - Giới tính: " + sex[i] + " - Lương: " + salary[i] +
                        " - Điểm TB: " + averageScore[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên có tên '" + ten + "'");
        }
    }

    // Phương thức tìm nhân viên theo tên (tìm gần đúng)
    public static void timNhanVienGanDung(String chuoiTen) {
        boolean found = false;
        System.out.println("\nKết quả tìm kiếm gần đúng:");
        for (int i = 0; i < numberOfEmployees; i++) {
            if (name[i].toLowerCase().contains(chuoiTen.toLowerCase())) {
                System.out.println("Nhân viên: " + name[i] + " - Tuổi: " + age[i] +
                        " - Giới tính: " + sex[i] + " - Lương: " + salary[i] +
                        " - Điểm TB: " + averageScore[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên nào có chứa '" + chuoiTen + "' trong tên.");
        }
    }
}