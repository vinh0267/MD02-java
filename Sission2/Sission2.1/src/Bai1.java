import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    //Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép người dùng nhập vào 1 khoảng số tự nhiên và yêu cầu tính tổng các số chẵn nằm trong khoảng đó.
    public static void main(String[] args) {
        //ng dùng nhập vào số phần tử của mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử trong mảng : ");
        int n = sc.nextInt();

        //khởi tạo mảng với số phần tử bằng sô người dùng nhập
        int[] arr = new int[n];
        System.out.println(Arrays.toString(arr)); //in ra mảng hiện tại

        //dùng vòng for để ng dùng nhập vào từng phần tử của mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println("hãy nhập phần thứ :" + i);
            int number = sc.nextInt();// khai báo 1 biê để lưu
            arr[i] = number; // gán số vừa nhập cho mảng arr[i]
        }
        System.out.println(Arrays.toString(arr)); // in ra mảng sau khi ng dùng nhập

        // loggic tính tổng
        int sum = 0;     //khởi ta biến đếm
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("tổng các số chẵn trong dãy số : " + sum);
    }
}
