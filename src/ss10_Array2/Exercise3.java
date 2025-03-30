package ss10_Array2;

import java.util.Scanner;

/**
 * Sử dụng các mảng 1 chiều để bổ sung xử lý bài nhập thông tin cho n nhân viên ở bài trước.
 * Sắp xếp nhân viên theo độ tuổi tăng dần. (*)
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
            if (numberOfEmployees >= 5) {
                System.out.println("Số lượng nhân viên đã đạt tối đa (5 người). Dừng nhập.");
                break;
            }
            nhapThongTin(numberOfEmployees);
            numberOfEmployees++;
            System.out.print("Nhập 'yes' hoặc 'y' để tiếp tục, 'no' để dừng lại: ");
            chose = scanner.nextLine();
        } while (chose.equalsIgnoreCase("yes") || chose.equalsIgnoreCase("y"));
        // không phân biệt chữ hoa, chữ thường.

//xuất thông tin nhân viên
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Thông tin nhân viên thứ " + (i + 1));
            xuatThongTin(i);
        }
        //sắp xếp theo độ tuổi tăng dần
        System.out.println("===== danh sách nhận viên sau khi sắp xếp theo tuổi =====");
        sapXepTangDanTheoTuoi();
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Thông tin nhân viên thứ " + (i + 1));
            xuatThongTin(i);
        }
    }

    static void sapXepTangDanTheoTuoi() {
        for (int i = 0; i < numberOfEmployees - 1; i++) {
            for (int j = i + 1; j < numberOfEmployees; j++) {
                //so sánh tuổi của nhân viên tại vị trí i,j
                if (age[i] > age[j]) {
                    // Hoán đổi vị trí
                    String ten = name[i];
                    name[i] = name[j];
                    name[j] = ten;

                    int Tuoi = age[i];
                    age[i] = age[j];
                    age[j] = Tuoi;

                    String gioiTinh = sex[i];
                    sex[i] = sex[j];
                    sex[j] = gioiTinh;

                    double mucLuong = salary[i];
                    salary[i] = salary[j];
                    salary[j] = mucLuong;

                    double diemTrungBinh = averageScore[i];
                    averageScore[i] = averageScore[j];
                    averageScore[j] = diemTrungBinh;
                }
            }
        }
    }

    static void nhapThongTin(int index) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        name[index] = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        age[index] = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập giới tính: ");
        sex[index] = scanner.nextLine();

        System.out.print("Nhập lương: ");
        salary[index] = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập điểm trung bình: ");
        averageScore[index] = Double.parseDouble(scanner.nextLine());
    }

    static void xuatThongTin(int index) {
        System.out.println("Họ và tên: " + name[index]);
        System.out.println("Tuổi: " + age[index]);
        System.out.println("Giới tính: " + sex[index]);
        System.out.println("Lương: " + salary[index]);
        System.out.println("Điểm trung bình: " + averageScore[index]);
    }
}