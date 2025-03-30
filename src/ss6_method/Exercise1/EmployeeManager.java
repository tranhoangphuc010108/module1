package ss6_method.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    String position;
    double salary;

    // Constructor
    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    // Phương thức hiển thị thông tin nhân viên
    public void display() {
        System.out.printf("%-20s %-5d %-20s %-10.2f\n", name, age, position, salary);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (employees.size() < 5) {
            System.out.println("\nNhập thông tin nhân viên:");

            System.out.print("Tên: ");
            String name = scanner.nextLine().trim();

            int age = 0;
            while (true) {
                try {
                    System.out.print("Tuổi: ");
                    age = Integer.parseInt(scanner.nextLine().trim());
                    if (age > 0) break;
                    System.out.println("⚠ Tuổi phải lớn hơn 0! Vui lòng nhập lại.");
                } catch (NumberFormatException e) {
                    System.out.println("⚠ Lỗi! Vui lòng nhập số nguyên cho tuổi.");
                }
            }

            System.out.print("Vị trí: ");
            String position = scanner.nextLine().trim();

            double salary = 0;
            while (true) {
                try {
                    System.out.print("Lương: ");
                    salary = Double.parseDouble(scanner.nextLine().trim());
                    if (salary >= 0) break;
                    System.out.println("⚠ Lương không thể là số âm! Nhập lại.");
                } catch (NumberFormatException e) {
                    System.out.println("⚠ Lỗi! Vui lòng nhập số thực cho lương.");
                }
            }

            employees.add(new Employee(name, age, position, salary));

            if (employees.size() < 5) {
                System.out.print("Bạn có muốn nhập tiếp không? (Nhập 'No' để dừng, Enter để tiếp tục): ");
                String response = scanner.nextLine().trim();
                if (response.equalsIgnoreCase("No")) break;
            }
        }

        // Hiển thị danh sách nhân viên
        System.out.println("\nDanh sách nhân viên:");
        System.out.printf("%-20s %-5s %-20s %-10s\n", "Tên", "Tuổi", "Vị trí", "Lương");
        System.out.println("------------------------------------------------------------");
        for (Employee emp : employees) {
            emp.display();
        }
        System.out.println("------------------------------------------------------------");

        scanner.close();
    }
}
