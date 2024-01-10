import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("moi nhap vao 1 so tu 0 - 9 :");
        int number = sc.nextInt();

        switch (number){
            case 0:
                System.out.println(" không");
                break;
            case 1:
                System.out.println(" mot");
                break;
            case 2:
                System.out.println(" hai");
                break;
            case 3:
                System.out.println(" ba");
                break;
            case 4:
                System.out.println(" bon");
                break;
            case 5:
                System.out.println(" nam");
                break;
            case 6:
                System.out.println(" sau");
                break;
            case 7:
                System.out.println(" bay");
                break;
            case 8:
                System.out.println(" tam");
                break;
            case 9:
                System.out.println(" chin");
                break;
            default:
                System.out.println("err");
                break;
        }
    }
}
