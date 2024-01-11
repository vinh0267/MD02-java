public class Bai4 {
    public static void main(String[] args) {
        // hiển thị 20 số nguyên tố đầu tiên
        int count = 0;
        int number = 2;

        while (count < 20) {
            boolean check = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(number);
                count++;
            }

            number++;
        }
    }
}
