import java.util.Scanner;

public class bai3_songaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng (1 - 12): ");
        int thang = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập năm: ");
        int nam = Integer.parseInt(scanner.nextLine());

        int soNgay;

        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 ||
            thang == 8 || thang == 10 || thang == 12) {
            soNgay = 31;
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            soNgay = 30;
        } else if (thang == 2) {
            // Kiểm tra năm nhuận: chia hết cho 4 và (không chia hết cho 100 hoặc chia hết cho 400)
            boolean namNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
            soNgay = namNhuan ? 29 : 28;
        } else {
            System.out.println("Tháng không hợp lệ!");
            scanner.close();
            return;
        }

        System.out.println("Tháng " + thang + " năm " + nam + " có " + soNgay + " ngày.");

        scanner.close();
    }
}
