import java.util.Scanner;
public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD, VND;
        int change;
        System.out.println("chọn 1 để chuyển từ VND sang USd" + "\n" + "Chọn 2 để chuyển từ USD sang VND");
        System.out.println("Nhập số (chọn 1 hoặc 2) :");
        change = scanner.nextInt();
        if (change == 1) {
            System.out.println("nhập số tiền cần chuyển đổi (VND): ");
            VND = scanner.nextInt();
            System.out.println("số tiền cần chuyển đổi là: " + VND / 23000 + "USD");
        }
        if (change == 2) {
            System.out.println("nhập số tiền chuyển đổi (USD): ");
            USD = scanner.nextInt();
            System.out.println("số tiền cần chuyển đổi là: " + USD * 23000 + "VND");
        }
    }
}