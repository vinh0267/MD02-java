
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn Toán: ");
        short diemToan = scanner.nextShort();

        System.out.print("Nhập điểm môn Lý: ");
        short diemLy = scanner.nextShort();

        System.out.print("Nhập điểm môn Hóa: ");
        short diemHoa = scanner.nextShort();

        float diemTrungBinh = (diemToan + diemLy + diemHoa) / 3.0f;

        if ( diemTrungBinh >= 0 && diemTrungBinh <5) {
            System.out.println("HS trung bình");
        } else {
            System.out.println("HS giỏi");
        }

    }
}
