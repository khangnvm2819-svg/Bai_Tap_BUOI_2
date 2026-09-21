import java.util.Scanner;

public class bai1_hocluc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm trung bình (0 - 10): ");
        double diem = Double.parseDouble(scanner.nextLine());

        String hocLuc;

        if (diem >= 8.0) {
            hocLuc = "Giỏi";
        } else if (diem >= 6.5) {
            hocLuc = "Khá";
        } else if (diem >= 5.0) {
            hocLuc = "Trung bình";
        } else {
            hocLuc = "Yếu";
        }

        System.out.println("Học lực: " + hocLuc);

        scanner.close();
    }
}
