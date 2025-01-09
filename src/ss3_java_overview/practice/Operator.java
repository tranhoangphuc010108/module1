package ss3_java_overview.practice;

public class Operator {
    public static void main(String[] args) {
        int a = 3;
        int b =6;
        int sum = a + b;
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        System.out.println("Thương: " + ((double)a / b));
        System.out.println(" chia lấy dư: " + a % b);
        int c = 2;
        int d = c++ + --c;
        System.out.println("c= " + c);
        System.out.println("d= " + d);


    }
}