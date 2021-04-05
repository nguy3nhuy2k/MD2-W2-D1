import java.util.Scanner;

public class UDtinhtienlai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        double money = scanner.nextDouble();

        System.out.println("nhập số tháng b muốn gửi");
        int month = scanner.nextInt();

        System.out.println("tiền lãi");
        double lai = scanner.nextDouble();
        double total = 0;

        for (int i = 0; i < month; i++) {
            total += money * (lai/100)/12 * month;
        }
        System.out.println(total);
    }
}
