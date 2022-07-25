import java.util.Scanner;

public class Baichuanbi2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double tienLai = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền đầu tư: ");
        money = input.nextInt();
        System.out.println("nhập số tháng gửi: ");
        month = input.nextInt();
        System.out.println("nhập lãi xuất hàng năm: ");
        tienLai = input.nextDouble();
        double tongLai = 0;
        for (int i = 1;i < month;i++){
            tongLai += money * (tienLai/100)/12*month;
        }
        System.out.println("tổng tiền lãi: " +tongLai);
    }
}
