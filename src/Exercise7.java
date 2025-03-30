 import java.util.Scanner;



 public class Exercise7 {


     static String[] names = new String[5];

     static int[] ages = new int[5];
     static String[] sexes = new String[5];
     static double[] salaries = new double[5];
     static double[] averageScores = new double[5];

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n;
         do {
             System.out.println("Nhập vào số lượng nhân viên: ");
             n = Integer.parseInt(scanner.nextLine());
             if (n < 0 || n > 5) {
                 System.out.println("Số lượng nhân viên không hợp lệ (phải <= 5), vui lòng nhập lại.");
             }
         } while (n < 0 || n > 5);

         for (int i = 0; i < n; i++) {
             System.out.println("=== Nhập thông tin nhân viên thứ " + (i + 1) + " ===");
             enterInformation(i, scanner);
         }

         System.out.println("\n=== Thông tin nhân viên đã nhập ===");
         for (int i = 0; i < n; i++) {
             printEmployee(i);
         }

         scanner.close();
     }

     private static void enterInformation(int index, Scanner scanner) {
         System.out.print("Nhập vào tên: ");
         names[index] = scanner.nextLine();

         System.out.print("Nhập vào tuổi: ");
         ages[index] = Integer.parseInt(scanner.nextLine());

         System.out.print("Nhập vào giới tính: ");
         sexes[index] = scanner.nextLine();

         System.out.print("Nhập vào mức lương: ");
         salaries[index] = Double.parseDouble(scanner.nextLine());

         System.out.print("Nhập vào điểm trung bình: ");
         averageScores[index] = Double.parseDouble(scanner.nextLine());
     }

     private static void printEmployee(int index) {
         System.out.println("Tên: " + names[index]);
         System.out.println("Tuổi: " + ages[index]);
         System.out.println("Giới tính: " + sexes[index]);
         System.out.println("Lương: " + salaries[index]);
         System.out.println("Điểm trung bình: " + averageScores[index]);
         System.out.println("---------------------------");
     }
 }
