package ss3_java_overview.exercise.exercise7;

/**
 * c.    int i = 1, j = 1;
 * int a = ++i + j++;
 */
public class Exercise7c {
    public static void main(String[] args) {
        int i = 1,j = 1;
        int  a = ++i + j++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
    }
}
