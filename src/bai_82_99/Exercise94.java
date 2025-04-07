package bai_82_99;

/**
 * Bài 94: Viết chương trình in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93
 */
public class Exercise94 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i += 2) {
            if (i == 5 || i == 7 || i == 93) {
                continue;//continue để bỏ qua số đó mà không thực hiện lệnh in ra số.
            }
            System.out.print(i + " ");
        }
    }
}
