import java.util.Arrays;
import java.util.Scanner;

public class Cau1 {
    public int[] cau1(int n) {
        //        1 Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím, thực hiện các công việc sau:
        //        Nhập các phần tử mảng
        //        In dữ liệu
        //        Tìm phần tử nhỏ nhất và lớn nhất trong mảng
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập number[%d]: ", i);
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public int max(int[] m) {
        int max = Arrays.stream(m).max().getAsInt();
        return max;
    }

}
