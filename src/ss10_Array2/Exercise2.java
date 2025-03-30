package ss10_Array2;
/**
 * Các thao tác thêm/xóa/sửa
 * a.    Sửa các số nguyên tố có trong mảng thành số 0
 * b.    Chèn số 0 đằng sau các số nguyên tố trong mảng
 * c.    Xóa các phần tử trong mảng a có giá trị k được nhập vào từ bàn phím. (*)
 * d.    Xóa tất cả số nguyên tố có trong mảng
 * e.    Chèn 1 phần tử vào vị trí k bất kỳ (lưu ý: cần xóa bớt phần tử cuối cùng).
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Nhập lại số nguyên dương (n>0), xin nhập lại: ");
            }
        } while (n <= 0);

        int[] arr = new int[n];
        nhapMang(arr);

        System.out.println("Các phần tử trong mảng: ");
        xuatMang(arr);


        // a. Sửa các số nguyên tố thành số 0
        suaSoNguyenTo(arr);
        System.out.println("Mảng sau khi sửa số nguyên tố thành 0: ");
        xuatMang(arr);

        // b. Chèn số 0 đằng sau các số nguyên tố
        arr = chenSoKhongSauSoNguyenTo(arr);
        System.out.println("Mảng sau khi chèn số 0 sau số nguyên tố: ");
        xuatMang(arr);

        // c. Xóa các phần tử có giá trị k nhập từ bàn phím
        System.out.print("Nhập giá trị k cần xóa: ");
        int k = scanner.nextInt();
        arr = xoaPhanTu(arr, k);
        System.out.println("Mảng sau khi xóa phần tử có giá trị k: ");
        xuatMang(arr);

        // d. Xóa tất cả số nguyên tố
        arr = xoaTatCaSoNguyenTo(arr);
        System.out.println("Mảng sau khi xóa tất cả số nguyên tố: ");
        xuatMang(arr);

        // e. Chèn phần tử vào vị trí k bất kỳ
        System.out.print("Nhập giá trị cần chèn: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vị trí k muốn chèn: ");
        int b = scanner.nextInt();
        arr = chenPhanTu(arr, a, b);
        System.out.println("Mảng sau khi chèn: ");
        xuatMang(arr);
    }

    static void nhapMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
    }

    static void xuatMang(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static void suaSoNguyenTo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr[i] = 0;
            }
        }
    }

    static int[] chenSoKhongSauSoNguyenTo(int[] arr) { // [1, 2, 3, 4, 5] => [1, 2, 0, 3, 0, 4, 5, 0]
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) count++;
        }
        int[] newArr = new int[arr.length + count];
        int j = 0;
        for (int num : arr) {
            newArr[j++] = num;
            if (isPrime(num)) {
                newArr[j++] = 0;
            }
        }
        return newArr;
    }

    static int[] xoaPhanTu(int[] arr, int k) {
        int count = 0;
        for (int num : arr) {
            if (num == k) count++;
        }
        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int num : arr) {
            if (num != k) {
                newArr[j++] = num;
            }
        }
        return newArr;
    }

    static int[] xoaTatCaSoNguyenTo(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) count++;
        }
        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int num : arr) {
            if (!isPrime(num)) {
                newArr[j++] = num;
            }
        }
        return newArr;
    }

    static int[] chenPhanTu(int[] arr, int value, int pos) { // [1, 2, 3, 4, 5]
        if (pos < 0 || pos >= arr.length) { // index của mảng
            System.out.println("Vị trí không hợp lệ!"); // 100, 2 => [1, 2, 100, 3, 4, 5]
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == pos) { // 2 == 2
                newArr[j++] = value;
            } else {
                newArr[j] = arr[i];
            }
        }
        return newArr;
    }
}
