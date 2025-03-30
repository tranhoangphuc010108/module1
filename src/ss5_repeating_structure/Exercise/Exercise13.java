package ss5_repeating_structure.Exercise;


/**
 * Nhập 2 số nguyên dương a và b. Sau đó in
 * ra ước số chung lớn nhất và bội số chung
 * nhỏ nhất của 2 số nguyên dương a và b đó.
 */

// 6 => Ước: 6 3 2 1
// 9 => Ước: 9 3 1
// 6 - 9: 1 3
// => UCLN: 3

/*
a = 6
b = 9

for i = a; true; i--      / i = 3
    if a % i == 0 && b % i == 0 // true && true
        i la USCLN => break

 */


/*
a = 6
b = 9

18, 36, .....
BSCNN: 18

for i = a; i >= 1; i++
    if i % a == 0 && i % b == 0
        i la BSCNN

for i = a; i >= 1; i+= a
    if i % b == 0
        i la BSCNN

 */
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        int uscln = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                uscln = i;
                break;
            }
        }
        int bscnn = 1;

        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                bscnn = i;
                break;

            }
        }
        System.out.print("Uớc số chung lớn nhất của " + a + " và " + b + " là " + uscln );
        System.out.print("Bội số chung nhỏ nhất của " + a + " và " + b + " là " + bscnn );
    }
}