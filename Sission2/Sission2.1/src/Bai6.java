import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Mời nhập số để kiểm tra: ");
            int number = sc.nextInt();

            System.out.println("Mời nhập lựa chọn: ");
            System.out.println("1. Kiểm tra tính chẵn lẻ của số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số chia hết cho 3");
            System.out.println("4. Thoát");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn");
                    } else {
                        System.out.println(number + " là số lẻ");
                    }
                    break;
                case 2:
                    boolean isPrime = true;
                    if (number < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                            if (number % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println(number + " là số nguyên tố");
                    } else {
                        System.out.println(number + " không là số nguyên tố");
                    }
                    break;
                case 3:
                    if (number % 3 == 0) {
                        System.out.println(number + " chia hết cho 3");
                    } else {
                        System.out.println(number + " không chia hết cho 3");
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
            System.out.println();
        }
        System.out.println("Chương trình đã kết thúc.");

    }
}
