package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Nhập lại số nguyên dương (n > 0), xin nhập lại: ");
            }
        } while (n <= 0);

        int[] arr = new int[n];
        nhapMang(arr);
        System.out.println("Các phần tử trong mảng: ");
        xuatMang(arr);

        // a. Tách các số nguyên tố vào mảng b
        int[] primeArray = tachSoNguyenTo(arr);
        System.out.println("Mảng chứa số nguyên tố: " + Arrays.toString(primeArray));

        // b. Tách thành 2 mảng b (số dương) và c (số còn lại)
        tachSoDuongVaConLai(arr);

        // c. Sắp xếp mảng giảm dần
        sapXepGiamDan(arr);
        System.out.println("Mảng sau khi sắp xếp giảm dần: " + Arrays.toString(arr));

        // d. Sắp xếp số dương giảm dần, số âm tăng dần, số 0 ở cuối
        sapXepDacBiet(arr);
        System.out.println("Mảng sau khi sắp xếp đặc biệt: " + Arrays.toString(arr));

        // e. Đảo ngược mảng
        daoNguocMang(arr);
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(arr));

        // f. Kiểm tra mảng đối xứng
        if (kiemTraDoiXung(arr)) {
            System.out.println("Mảng là mảng đối xứng.");
        } else {
            System.out.println("Mảng không phải là mảng đối xứng.");
        }

        // g. Đếm số cặp số đối xứng
        int soCapDoiXung = demCapDoiXung(arr);
        System.out.println("Số cặp số đối xứng trong mảng: " + soCapDoiXung);
    }

    // Nhập mảng
    public static void nhapMang(int[] arr) {
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    // Xuất mảng
    public static void xuatMang(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Tách số nguyên tố
    public static int[] tachSoNguyenTo(int[] arr) {
        return Arrays.stream(arr).filter(Exercise1::isPrime).toArray();
    }

    // Tách số dương và số còn lại
    public static void tachSoDuongVaConLai(int[] arr) {
        int[] soDuong = Arrays.stream(arr).filter(x -> x > 0).toArray();
        int[] soConLai = Arrays.stream(arr).filter(x -> x <= 0).toArray();
        System.out.println("Mảng chứa số dương: " + Arrays.toString(soDuong));
        System.out.println("Mảng chứa số còn lại: " + Arrays.toString(soConLai));
    }

    // Sắp xếp giảm dần
    public static void sapXepGiamDan(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // Sắp xếp số dương giảm dần, số âm tăng dần, số 0 ở cuối
    public static void sapXepDacBiet(int[] arr) {
        int[] soDuong = Arrays.stream(arr).filter(x -> x > 0).sorted().toArray();
        int[] soAm = Arrays.stream(arr).filter(x -> x < 0).sorted().toArray();
        int soKhong = (int) Arrays.stream(arr).filter(x -> x == 0).count();

        int index = 0;
        for (int i = soDuong.length - 1; i >= 0; i--) arr[index++] = soDuong[i];
        for (int j : soAm) arr[index++] = j;
        while (soKhong-- > 0) arr[index++] = 0;
    }

    // Đảo ngược mảng
    public static void daoNguocMang(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Kiểm tra mảng đối xứng
    public static boolean kiemTraDoiXung(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // Đếm số cặp số đối xứng
    public static int demCapDoiXung(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                count++;
            }
        }
        return count;
    }
}