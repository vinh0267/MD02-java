import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền : ");
        short dola = scanner.nextShort();

        float soTien = rate * dola;
        System.out.println("số tiền VND là  : " + soTien);
    }
}
