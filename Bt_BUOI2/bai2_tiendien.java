import java.util.Scanner;

public class bai2_tiendien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện tiêu thụ (kWh): ");
        int soDien = Integer.parseInt(scanner.nextLine());

        double tongTien = 0;

        if (soDien <= 50) {
            // Chỉ dùng ở bậc 1
            tongTien = soDien * 1600;
        } else if (soDien <= 100) {
            // Dùng hết bậc 1, một phần bậc 2
            tongTien = 50 * 1600 + (soDien - 50) * 1700;
        } else {
            // Dùng hết bậc 1, bậc 2, một phần bậc 3
            tongTien = 50 * 1600 + 50 * 1700 + (soDien - 100) * 2000;
        }

        System.out.println("Số điện tiêu thụ: " + soDien + " kWh");
        System.out.println("Tổng tiền phải trả: " + tongTien + " VNĐ");

        scanner.close();
    }
}
