import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Cau 1
//        Cau1 temp = new Cau1();
//        System.out.print("Nhập số phần tử: ");
//        int numberOfIntegers = sc.nextInt();
//        int[] tempArray = temp.cau1(numberOfIntegers);
//        System.out.println(Arrays.toString(tempArray));
//        System.out.printf("Giá trị max: %d", temp.max(tempArray));

//        Cau 2
        Cau2 temp1 = new Cau2();
        System.out.print("Nhập số phương tiện: ");
        int numberOfVehicles = sc.nextInt();
        String[][] tempVehicleArray = temp1.cau2(numberOfVehicles);
        System.out.println(Arrays.deepToString(tempVehicleArray));
    }
}
