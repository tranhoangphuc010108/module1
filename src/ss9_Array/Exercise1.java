package ss9_Array;

import java.util.Scanner;

/**
 * Bạn được yêu cầu viết một chương trình Java thực hiện các chức năng sau liên quan đến mảng một chiều:
 * <p>
 * 1. Các thao tác nhập xuất
 * a. Nhập mảng
 * b. Xuất mảng
 * 2. Các thao tác kiểm tra
 * a. Mảng có phải là mảng toàn chẵn?
 * b. Mảng có phải là mảng toàn số nguyên tố?
 * c. Mảng có phải là mảng tăng dần?
 * 3. Các thao tác tính toán
 * a. Đếm số lượng phần tử lẻ có trong mảng a.
 * b. Tính tổng số dương lẻ của mảng a.
 * c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
 * d. Tổng các số nguyên tố có trong mảng.
 * 4. Các thao tác tìm kiếm
 * a. Vị trí cuối cùng của phần tử x trong mảng.
 * b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
 * c. Tìm số dương nhỏ nhất trong mảng.
 * d. Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng
 * không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
 * e. Tìm giá trị lớn nhất và nhỏ nhất của mảng a.
 */
public class Exercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        do {
            System.out.print("Nhập vào số lượng phần tử của mảng: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Nhập lại số nguyên dương(n>0), xin nhập lại: ");
            }
        } while (n <= 0);

        int[] arr = new int[n];

        inputArray(arr);
        outputArray(arr);

        System.out.println("\n2a.Kiểm tra mảng toàn chẵn: ");
        if (isAllEven(arr)) {
            System.out.println("MẢng toàn chẵn: ");

        } else {
            System.out.println("MẢng khng toàn chẵn: ");
        }
        System.out.println("2b.Kiểm tra mảng toàn số nguyên tố: ");
        if (isAllPrime(arr)) {
            System.out.println("Mảng toàn số nguyên tố: ");
        } else {
            System.out.println("Mảng không toàn số nguyên tố:");
        }

        System.out.println("2c.Kiểm tra mảng tăng dần: ");
        if (isAscending(arr)) {
            System.out.println("Mảng toàn tăng dần: ");
        } else {
            System.out.println("Mảng không tăng dần: ");
        }
        System.out.println("Số lượng phần tử lẻ: " + countOdd(arr));
        System.out.println("Tổng số dương lẻ: " + sumOddPositive(arr));
        System.out.println("Số lượng số chia hết cho 4 nhưng không chia hết cho 5: " + countDiv4Not5(arr));
        System.out.println("Tổng các số nguyên tố trong mảng: " + sumPrime(arr));
        System.out.println("4a. Vị trí cối cùng của phần tử x trên mảng: ");
        System.out.println("Nhập phần tử x để tìm x: ");
        int x = scanner.nextInt();
        int lastIndex = lastIndexOf(arr, x);

        if (lastIndex == -1) {
            System.out.println("Không tìm thấy phần tử x trên mảng: ");
        } else {
            System.out.println("Vị trí xuất hiện cuối cùng: " + lastIndex);
        }
        System.out.println("4b. Vị trí số nguyên tố đầu tiên trong mảng nếu có: ");
        int firstPrimeIndex = firstPrimeIndex(arr);
        if (firstPrimeIndex == -1) {
            System.out.println("Không tìm thấy số nguyên trên mảng: ");
        } else {
            System.out.println("Vị trí xuất hiện số nguyên tố đầu tiên: " + lastIndex);
        }

        System.out.println("4c. Tìm só dương nhỏ nhất trên mảng: ");
        int minPosttive = findMinPositive(arr);
        if (minPosttive == -1) {
            System.out.println("Không tìm thấy số dương: ");
        } else {
            System.out.println("GIá trị dương nhỏ nhất trong mảng: " + minPosttive);
        }

        System.out.println("4d. Các vị trí của k trong mảng: ");
        System.out.println("Nhập vị trí k để tìm");
        int k = scanner.nextInt();
        findElementInArray(arr, k);

        System.out.println("Giá trị lớn nhất: " + findMax(arr));
        System.out.println("Giá trị nhỏ nhất: " + findMin(arr));
    }

    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void outputArray(int[] arr) {
        System.out.print("Mảng vừa nhập: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static boolean isAllEven(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) return false;
        }

//        for(int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) return false;
//        }

        return true;
    }

    public static boolean isAllPrime(int[] arr) {
        for (int num : arr) {
            if (!isPrime(num)) return false;
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    public static int countOdd(int[] arr) { // [1, 2, 3, 4, 4, 3]
        int count = 0; // count = 0
        for (int num : arr) {
            if (num % 2 != 0) count++; // count = 3
        }
        return count;
    }

    public static int sumOddPositive(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0 && num % 2 != 0) sum += num;
        }
        return sum;
    }

    public static int countDiv4Not5(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 4 == 0 && num % 5 != 0) count++;
        }
        return count;
    }

    public static int sumPrime(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isPrime(num)) sum += num;
        }
        return sum;
    }

    public static int lastIndexOf(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static int firstPrimeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) return i;
        }
        return -1;
    }

    public static int findMinPositive(int[] arr) {
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int num : arr) {
            if (num > 0 && num < min) {
                min = num;
                found = true;
            }
        }
        return found ? min : -1;
    }

    public static void findElementInArray(int[] arr, int k) {
        boolean found = false;
        System.out.print("Vị trí xuất hiện của " + k + ": ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy");
        System.out.println();
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
}
