package ss3_java_overview.exercise.exercise7;

/**
 * h.    int a = 10;
 * a += a++ + ++a;
 */

public class Exercise7h {
    public static void main(String[] args) {
        int a = 10;
        a += a++ + ++a;
        System.out.println("a = " + a);
    }
}
