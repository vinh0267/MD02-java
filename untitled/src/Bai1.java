import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String fullName = name.nextLine();

        System.out.println("Hello: " + fullName);
    }
}
