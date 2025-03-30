package ss4_conditon_structure.exercise;

/**
 * Tính giá trị của biến c và biến d:
 * <p>
 * boolean a = true && false;
 * boolean b = (3 > 100) || (25 % 5 == 0)
 * boolean c = a && b;
 * boolean d = !a || b;
 */
// Ctrl + Alt + L: format code
public class Exercise1 {
    public static void main(String[] args) {
        boolean a = true && false; // false
        /*
        &&: And, và: true khi cả 2 vế đều true
        ||: or, hoặc: false khi cả 2 vế đều false
         */
        boolean b = (3 > 100) || (25 % 5 == 0); // false || true = true
        boolean c = a && b; // false && true = false
        boolean d = !a || b; // !false || true = true || true = true

        System.out.println("c =" + c); // false
        System.out.println("d =" + d); // true
    }
}