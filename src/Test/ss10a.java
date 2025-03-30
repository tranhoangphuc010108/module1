package Test;
import java.util.Arrays;

    public class ss10a {
        public static void main(String[] args) {
            int[] a = {1, 45, 56, 43, 34}; // Mảng ban đầu

            int x = 99; // Số cần chèn
            int position = 2; // Chỉ mục (index) 2 -> vị trí thứ 3 (tính từ 1)

            a = add(a, x, position); // Gọi phương thức add
            System.out.println(Arrays.toString(a)); // In kết quả
        }

        public static int[] add(int[] a, int x, int position) {
            // Tạo mảng mới có kích thước lớn hơn 1
            int[] b = new int[a.length + 1];

            // Sao chép các phần tử trước vị trí chèn
            for (int i = 0; i < position; i++) {
                b[i] = a[i];
            }

            // Chèn phần tử mới vào vị trí chỉ định
            b[position] = x;

            // Sao chép phần còn lại của mảng cũ (dịch sang phải)
            for (int i = position; i < a.length; i++) {
                b[i + 1] = a[i];
            }

            return b; // Trả về mảng mới
        }
    }

