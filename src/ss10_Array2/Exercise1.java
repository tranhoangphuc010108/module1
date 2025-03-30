package ss10_Array2;

/**
 * Các thao tác xử lý
 * a. Tách các số nguyên tố có trong mảng a đưa vào mảng b.
 * b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
 * c. Sắp xếp mảng giảm dần
 * d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần,
 * kế đến là các số âm tăng dần, cuối cùng là các số 0.
 * e. Đảo thứ tự các phần tử của mảng a.
 * f. Kiểm tra xem mảng a có phải là mảng đối xứng hay không.
 * Vd: Mảng sau là mảng đối xứng {1, 2, 4, 7, 3, 7, 4, 2, 1}
 * g. Đếm số cặp số đối xứng trong mảng.
 * Vd: Mảng sau {1, 2, 8, 7, 3, 7, 4, 2, 1} có 3 cặp số đối xứng
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

    public class Exercise1 {
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

            System.out.println("Mảng chứa số nguyên tố trong mảng:");
            int[] brr = tachSoNguyenTo(arr);
            xuatMang(brr);

            System.out.println("Mảng chứa số dương trong mảng a: " + Arrays.toString(tachSoDuong(arr)));
            System.out.println("Mảng chứa số không dương: " + Arrays.toString(tachSoKhongDuong(arr)));
            System.out.println("Mảng sau khi sắp xếp giảm dần: ");
            sapXepGiamDan(arr);
            xuatMang(arr);

            // Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần,
            System.out.println("Mảng sau khi sắp xếp theo quy tắc đặc biệt: ");
            sapXepDacBiet(arr);
            xuatMang(arr);

            System.out.println("Mảng sau khi đảo ngược: ");
            daoNguocMang(arr);
            xuatMang(arr);

            if (kiemTraDoiXung(arr)) {
                System.out.println("Mảng là mảng đối xứng.");
            } else {
                System.out.println("Mảng không phải là mảng đối xứng.");
            }

            System.out.println("Số cặp số đối xứng trong mảng: " + demCapSoDoiXung(arr));
        }

        static void nhapMang(int[] arr) {
            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
        }

        static void xuatMang(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        static boolean isPrime(int num) {
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        static int[] tachSoNguyenTo(int[] arr) {
            // Java 8
            // filter => if => Lọc theo điều kiện
            // Để sử dụng filter thì phải chuyển về dạng stream
            /*
            Bước 1: Chuyển array về stream để sử dụng filter: Arrays.stream(arr)
            Bước 2: Chỉ lấy các số nguyên tố: filter(Exercise1::isPrime)
            Bước 3: Chuyển stream về lại Arrray: .toArray();

            [1, 2, 3, 4, 5]

            number = 3
            [2, 3, 5]
             */
            return Arrays.stream(arr).filter(number -> Exercise1.isPrime(number)).toArray();
        }

        static int[] tachSoDuong(int[] arr) {
            return Arrays.stream(arr).filter(num -> num > 0).toArray();
        }
        static int[] tachSoKhongDuong(int[] arr) {
            return Arrays.stream(arr).filter(num -> num <= 0).toArray();
        }
        static void sapXepGiamDan(int[] arr) {
            // [3, 2, 5, 1]
            Arrays.sort(arr); // Sắp xếp tăng dần [1, 2, 3, 5]
            for (int i = 0; i < arr.length / 2; i++) { // i = 0, 1
                int temp = arr[i];
                // i = 0 => arr[0], arr[3] => Hoa vi [5, 2, 3, 1]
                // i = 1 => arr[1], arr[2] => Hoa vi [5, 3, 2, 1]
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp; //
            }
        }

        // Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần,
        static void sapXepDacBiet(int[] arr) {
            Arrays.sort(arr);
            // [-5, -2, 0, 9, 10]
            // 10, 9, ...
            int[] temp = new int[arr.length]; // 5 phần tử [10, 9, -5, -2, 0]
            int index = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] > 0) temp[index++] = arr[i];
            }
            for (int num : arr) {
                if (num <= 0) temp[index++] = num;
            }
//            for (int num : arr) {
//                if (num == 0) temp[index++] = num;
//            }
            System.arraycopy(temp, 0, arr, 0, arr.length);
        }

        static void daoNguocMang(int[] arr) {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
//12321
        static boolean kiemTraDoiXung(int[] arr) {
            for (int i = 0; i < arr.length / 2; i++) { // 0 1
                if (arr[i] != arr[arr.length - 1 - i]) return false;
            }
            return true;
        }

        static int demCapSoDoiXung(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] == arr[arr.length - 1 - i]) count++;
            }
            return count;
        }
    }
