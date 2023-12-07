import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang muon tinh ngay");
        int month = sc.nextInt();

        switch (month) {
            case 2:
                System.out.println("Thang 2 co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+ month+ " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+ month+" co 30 ngay");
                break;
            default:
                System.out.print("Invalid input!");
                break;

        }
    }
}
