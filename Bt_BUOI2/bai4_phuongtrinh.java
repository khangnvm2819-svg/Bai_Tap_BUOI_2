import java.util.Scanner;

public class bai4_phuongtrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập hệ số b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Phương trình: " + a + "x + " + b + " = 0");

        if (a == 0 && b == 0) {
            // 0x + 0 = 0 luôn đúng với mọi x
            System.out.println("Phương trình vô số nghiệm.");
        } else if (a == 0 && b != 0) {
            // 0x + b = 0 (b != 0) không có x nào thỏa
            System.out.println("Phương trình vô nghiệm.");
        } else {
            // a != 0: nghiệm duy nhất
            double x = -b / a;
            System.out.println("Phương trình có nghiệm duy nhất: x = " + x);
        }

        scanner.close();
    }
}
