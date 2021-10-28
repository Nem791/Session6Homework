import java.util.Scanner;

public class Cau2 {
    public String[][] cau2(int n) {
//        2 Tạo mảng gồm n phần tử, mảng chứa thông tin của cá phương tiên giao thông gồm: mã số, tên phương tiên, vận tốc tối đa
//        Nhập các phần tử mảng
//        In dữ liệu ra màn hình
        Scanner sc = new Scanner(System.in);

        String[][] vehicles = new String[n][3];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập mã số %d(int): ", i);
            vehicles[i][0] = String.valueOf(sc.nextInt());
            sc.nextLine();
            System.out.printf("Nhập tên phương tiện %d: ", i);
            vehicles[i][1] = sc.nextLine();
            System.out.printf("Nhập vận tốc tối đa %d (km/h): ", i);
            vehicles[i][2] = String.valueOf(sc.nextInt());
        }
        return vehicles;
    }
}
