public class Bai5 {
    public static void main(String[] args) {
        //Tìm số nguyên dương nhỏ nhất chia hết cho 5,7 và 11
        for (int i = 1; i < i + 1; i++) {
            if (i % 5 == 0 && i % 7 == 0 && i % 11 == 0) {
                System.out.println("số nhỏ nhất vua chia het cho 5 , 7 vs 11 là :" + i);
                break;
            }
        }
    }
}
