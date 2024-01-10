import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("moi nhap vao so cua ban can kiem tra : ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("số chia hết cho 2");
        } else {
            System.out.println("không chia hết cho 2");
        }
    }
}