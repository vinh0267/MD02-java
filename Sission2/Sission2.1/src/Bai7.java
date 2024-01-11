import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "1. Tinh chu vi va dien tich hinh chu nhat.\n" +
                            "2. Tinh chu vi va dien tich hinh tam giac\n" +
                            "3. Tinh chu vi va dien tich hinh tron.\n" +
                            "4. Thoat\n" +
                            "Moi nhap vao 1 so " );

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Rectangle
                    System.out.println("Nhap chieu dai hinh chu nhat: ");
                    double length = sc.nextDouble();
                    System.out.println("Nhap chieu rong hinh chu nhat: ");
                    double width = sc.nextDouble();

                    double rectanglePerimeter = 2 * (length + width);
                    double rectangleArea = length * width;

                    System.out.println("Chu vi hinh chu nhat la: " + rectanglePerimeter);
                    System.out.println("Dien tich hinh chu nhat la: " + rectangleArea);
                    break;

                case 2:
                    // Triangle
                    System.out.println("Nhap do dai canh 1: ");
                    double side1 = sc.nextDouble();
                    System.out.println("Nhap do dai canh 2: ");
                    double side2 = sc.nextDouble();
                    System.out.println("Nhap do dai canh 3: ");
                    double side3 = sc.nextDouble();

                    double trianglePerimeter = side1 + side2 + side3;

                    // Sử dụng công thức Heron để tính diện tích tam giác
                    double s = trianglePerimeter / 2;
                    double triangleArea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

                    System.out.println("Chu vi hinh tam giac la: " + trianglePerimeter);
                    System.out.println("Dien tich hinh tam giac la: " + triangleArea);
                    break;

                case 3:
                    // Circle
                    System.out.println("Nhap ban kinh hinh tron: ");
                    double radius = sc.nextDouble();

                    double circlePerimeter = 2 * Math.PI * radius;
                    double circleArea = Math.PI * radius * radius;

                    System.out.println("Chu vi hinh tron la: " + circlePerimeter);
                    System.out.println("Dien tich hinh tron la: " + circleArea);
                    break;

                case 4:
                    // Thoat
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0); // Exit the program
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        }
    }
}
