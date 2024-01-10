import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều dai : ");
        int chieuDai = scanner.nextInt();

        System.out.println("nhap chieu rong : ");
        int chieuRong = scanner.nextInt();

        int dienTich = chieuDai * chieuRong;
        int chuvi = (chieuRong + chieuDai) * 2;

        System.out.println("dien tích HCN là : " + dienTich);
        System.out.println("chu vi HCN là : " + chuvi);


    }
}
