package ss4_conditon_structure.Exercise0;

import java.util.Scanner;

/**
 * Tính giá trị của biến c và biến d:
 * <p>
 * boolean a = true && false;
 * boolean b = (3 > 100) || (25 % 5 == 0)
 * boolean c = a  && b;
 * boolean d = !a || b;
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = true && false;
        boolean b = (3 > 100) || (25 % 5 == 0);
        boolean c = a && b;
        boolean d = !a || b;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
